package org.example;
public class OrdemServicoCriacaoChamado implements OrdemServicoCriacao {
    private static OrdemServicoCriacaoChamado procedimentoChamado = new OrdemServicoCriacaoChamado();

    private OrdemServicoCriacaoChamado() {};

    public static OrdemServicoCriacaoChamado getProcedimentoChamado() {
        return procedimentoChamado;
    }
}
