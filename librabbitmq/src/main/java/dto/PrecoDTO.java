package dto;

import java.io.Serializable;

public class PrecoDTO implements Serializable {

    private String codigoProduto;
    private Double preco;

    public PrecoDTO(){

    }

    public PrecoDTO(String codigoProduto, Double preco) {
        this.codigoProduto = codigoProduto;
        this.preco = preco;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
