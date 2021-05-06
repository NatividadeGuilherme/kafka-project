package br.natividade.usingkafka.dataprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.natividade.estoque.schema.Produto;
import br.natividade.usingkafka.entrypoint.controller.dto.ProdutoDTO;

@Component
public class EstoqueProducerDataProvider {

	@Value("${nome-topico}")
	private String topic;

	private Logger logger = LoggerFactory.getLogger(EstoqueProducerDataProvider.class);

	@Autowired
	private KafkaTemplate<String, Produto> kafkaTemplate;

	public void producerCadastroProduto(ProdutoDTO produto) {
		logger.info("Convertendo objeto...");
		
		Produto produtoSchema = Produto.newBuilder().setDescricao(produto.getDescricao().toString())
				.setQuantidadeEstoque(produto.getQuantidadeEstoque()).setValorUnitario(produto.getValorUnitario())
				.build();
		
		logger.info("Enviando mensagem " +  produto.getDescricao());
		
		kafkaTemplate.send(topic, produtoSchema.getDescricao().toString(), produtoSchema);
	}
}
