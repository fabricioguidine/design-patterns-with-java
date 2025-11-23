package org.example;
public class OrdemServicoCriacaoCancelamento implements OrdemServicoCriacao {

    private static OrdemServicoCriacaoCancelamento procedimentoCancelamento = new OrdemServicoCriacaoCancelamento();

    private OrdemServicoCriacaoCancelamento() {};

    public static OrdemServicoCriacaoCancelamento getProcedimentoCancelamento() {
        return procedimentoCancelamento;
    }
}
