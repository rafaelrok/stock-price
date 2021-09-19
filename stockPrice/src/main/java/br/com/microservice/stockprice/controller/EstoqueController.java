package br.com.microservice.stockprice.controller;

import br.com.microservice.stockprice.constantes.RabbitMQConstantes;
import br.com.microservice.stockprice.dto.EstoqueDTO;
import br.com.microservice.stockprice.service.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="estoque")
public class EstoqueController {

    @Autowired
    private RabbitmqService rabbitmqService;

    @PutMapping
    private ResponseEntity alteraEstoque(@RequestBody EstoqueDTO estoqueDTO){
        System.out.println(estoqueDTO.getCodigoProduto());
        this.rabbitmqService.enviaMensagem(RabbitMQConstantes.FILA_ESTOPQUE, estoqueDTO);
        return new ResponseEntity(HttpStatus.OK);
    }
}
