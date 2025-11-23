package org.example;
public class SetorSuporteTecnico extends SetorAtendimentoCliente {

    public SetorSuporteTecnico(SetorAtendimentoCliente superior) {
        listaProcedimento.add(OrdemServicoCriacaoChamado.getProcedimentoChamado());
        setFuncionarioSuperior(superior);
    }
    @Override
    public String getDescricaoCargo() {
        return "Suporte Tecnico";
    }
}
