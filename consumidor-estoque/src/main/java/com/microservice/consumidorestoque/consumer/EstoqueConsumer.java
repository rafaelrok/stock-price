package com.microservice.consumidorestoque.consumer;

import constantes.RabbitMQConstantes;
import dto.EstoqueDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitMQConstantes.FILA_ESTOPQUE)
    private void consumidor(EstoqueDTO estoqueDTO){
        System.out.println(estoqueDTO.getCodigoProduto());
        System.out.println(estoqueDTO.getQuantidade());
        System.out.println("-------------------------------------------");
    }

}
