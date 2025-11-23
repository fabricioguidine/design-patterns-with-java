package org.example;
public class SetorAdministrativo extends SetorAtendimentoCliente {

    public SetorAdministrativo(SetorAtendimentoCliente superior) {
        listaProcedimento.add(OrdemServicoCriacaoCancelamento.getProcedimentoCancelamento());
        setFuncionarioSuperior(superior);
    }
    @Override
    public String getDescricaoCargo() {
        return "Administrativo";
    }
}
