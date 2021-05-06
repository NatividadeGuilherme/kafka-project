package br.natividade.usingkafka.entrypoint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.natividade.usingkafka.dataprovider.EstoqueProducerDataProvider;
import br.natividade.usingkafka.entrypoint.controller.dto.ProdutoDTO;


@RestController
@RequestMapping("/estoque")
public class EstoqueController {

	private EstoqueProducerDataProvider estoqueDataProvider;
	
	public EstoqueController(EstoqueProducerDataProvider estoqueDataProvider) {
		this.estoqueDataProvider = estoqueDataProvider;
	}
	
	@PostMapping(value = "/produto/registrar")
	public ResponseEntity<ProdutoDTO> cadastrarProduto(@RequestBody ProdutoDTO produto){
		estoqueDataProvider.producerCadastroProduto(produto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(produto);
	}
}
