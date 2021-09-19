### Microserviço em Java Spring Boot com RabbitMQ

Este projeto é a criação de um microserviço reponsável por receber requisições e gerar mensagens
para os demais microsserviços, que são os consumidores da mensagem.

Foi desenvolvido 1 produtor em java com spring, 1 consumidor em java com spring e outro consumidor em nodejs.

### Instalação NodeJS

```npm install```
```npm install amqplib```

## Modelo de relação

![Projeto](https://i.ibb.co/VMJbYLm/modelo.png)
![Projeto](https://i.ibb.co/dQQtjd0/filas-rabbitmq.jpg)
