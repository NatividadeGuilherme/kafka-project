# kafka-project
Este projeto fornece um exemplo de como utilizar o Kafka como também o Schema Registry usando AVRO como serialização de dados.

Há definido um producer e um consumer ambos utilizando o avro pra serialização

Tecnologias usadas:
Spring Boot c/ Maven


# Instruções para execução
1º ter o docker e docker-compose instalado
2º executar o comando docker-compose up -d
3º criar um tópico no kafka
3º Executar aplicação


# Instruções para gerenciar tópicos na image do Kafka
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1  --partitions 1 --topic LOJA_NOVO_PEDIDO
