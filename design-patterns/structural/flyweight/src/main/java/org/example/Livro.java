package org.example;

public class Livro {

    private String nome;
    private Float preco;
    private Fornecedor fornecedor;

    public Livro(String nome, Float preco, Fornecedor fornecedor){
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getDetalhes(){
        return "Livro{" +
                "nome=" + this.nome +
                ", preco=R$" + this.preco +
                ", nomeFornecedor=" + fornecedor.getNome() +
                ", cidadeFornecedor=" + fornecedor.getCidade() +
                ", estadoFornecedor=" + fornecedor.getEstado() +
                "}";
    }
}