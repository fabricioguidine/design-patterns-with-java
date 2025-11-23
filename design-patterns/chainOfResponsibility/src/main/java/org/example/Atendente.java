package org.example;
public class Atendente extends SetorAtendimentoCliente {


    public Atendente(SetorAtendimentoCliente superior) {
        listaProcedimento.add(OrdemServicoCriacaoCadastramento.getProcedimentoCadastramento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
