package org.example;
public class OrdemServico {
    private static OrdemServicoCriacao tipoProcedimentoGerado;
    public OrdemServico(OrdemServicoCriacao procedimento) {

        this.tipoProcedimentoGerado= procedimento;
    }

    public static OrdemServicoCriacao getTipoProcedimentoGerado() {
        return tipoProcedimentoGerado;
    }

    public void setTipoProcedimentoGerado(OrdemServicoCriacao tipoProcedimentoGerado) {
        this.tipoProcedimentoGerado = tipoProcedimentoGerado;
    }
}
