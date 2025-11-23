package org.example;

public class OrdemServicoCriacaoBoleto implements OrdemServicoCriacao {

    private static OrdemServicoCriacaoBoleto procedimentoBoleto = new OrdemServicoCriacaoBoleto();

    private OrdemServicoCriacaoBoleto() {};

    public static OrdemServicoCriacaoBoleto getProcedimentoBoleto() {
        return procedimentoBoleto;
    }
}
