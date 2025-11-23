package org.example;
import java.util.ArrayList;

public abstract class SetorAtendimentoCliente {
    protected ArrayList listaProcedimento = new ArrayList();
    private SetorAtendimentoCliente funcionarioSuperior;

    public SetorAtendimentoCliente getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(SetorAtendimentoCliente funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String registrarProcedimento(OrdemServico ordemServico) {
        if (listaProcedimento.contains(OrdemServico.getTipoProcedimentoGerado())){
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.registrarProcedimento(ordemServico);
            }
            else
            {
                return "Sem Procedimento";
            }
        }
    }


}
