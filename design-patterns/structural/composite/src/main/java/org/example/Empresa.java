package org.example;
public class Empresa {
    private String nome;
    private String cnpj;
    private Pessoa colaboradores;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getColaboradores() {
        if (this.colaboradores == null) {
            throw new NullPointerException("Não há colaboradores registrados.");
        }
        return this.colaboradores.getInfo();
    }
    public void setColaboradores(Pessoa colaboradores) {
        this.colaboradores = colaboradores;
    }
}

