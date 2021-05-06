package br.natividade.usingkafka.dataprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.natividade.estoque.schema.Produto;

@Component
public class EstoqueConsumerDataProvider {

	private Logger logger = LoggerFactory.getLogger(EstoqueConsumerDataProvider.class);

	@KafkaListener(topics = "ESTOQUE_NATIVIDADE", groupId = "group_id")
	public void consumerProdutoCadastrado(Produto produto) {
		logger.info("### -> Messagem consumida -> \n Produto cadastrado\n Segue dados:" + " Descricao: "
				+ produto.getDescricao() + " Quantidade: " + produto.getQuantidadeEstoque() + " "
						+ " Valor unitário: " + produto.getValorUnitario());
	}
}
