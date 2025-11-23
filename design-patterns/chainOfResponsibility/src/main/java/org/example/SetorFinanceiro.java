package org.example;
public class SetorFinanceiro extends SetorAtendimentoCliente {

    public SetorFinanceiro(SetorAtendimentoCliente superior) {
        listaProcedimento.add(OrdemServicoCriacaoBoleto.getProcedimentoBoleto());
        setFuncionarioSuperior(superior);
    }
    @Override
    public String getDescricaoCargo() {
        return "Financeiro";
    }
}
