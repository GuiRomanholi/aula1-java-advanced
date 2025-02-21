package br.com.fiap.api_rest.model;

public enum Categoria {
    BRONZE("Bronze"),
    PREMIUN("Prata"),
    OURO("Ouro");

    private String descricao;

    Categoria(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
