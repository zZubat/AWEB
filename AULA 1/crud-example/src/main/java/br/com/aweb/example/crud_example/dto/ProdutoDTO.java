package br.com.aweb.example.crud_example.dto;

public class ProdutoDTO {
    private long id;
    private String name;
    private Double price;
    
    public ProdutoDTO(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
}
