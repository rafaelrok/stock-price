package br.com.microservice.stockprice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objMapper;

    public void enviaMensagem(String nomeFila, Object mensagem){
        try{
            String mensagemJson = this.objMapper.writeValueAsString(mensagem);
            this.rabbitTemplate.convertAndSend(nomeFila, mensagemJson);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
