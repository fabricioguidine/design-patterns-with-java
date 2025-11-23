package org.example;
public class OrdemServicoCriacaoCadastramento implements OrdemServicoCriacao {
    private static OrdemServicoCriacaoCadastramento procedimentoCadastramento = new OrdemServicoCriacaoCadastramento();

    private OrdemServicoCriacaoCadastramento() {};

    public static OrdemServicoCriacaoCadastramento getProcedimentoCadastramento() {
        return procedimentoCadastramento;
    }
}
