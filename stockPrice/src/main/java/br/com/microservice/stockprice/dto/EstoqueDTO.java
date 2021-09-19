package br.com.microservice.stockprice.dto;

import java.io.Serializable;

public class EstoqueDTO implements Serializable {

    private String codigoProduto;
    private Integer quantidade;

    public EstoqueDTO(){

    }

    public EstoqueDTO(String codigoProduto, Integer quantidade) {
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


}
