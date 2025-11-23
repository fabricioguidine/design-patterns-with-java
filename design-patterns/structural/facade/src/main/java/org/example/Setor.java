package org.example;

import java.util.ArrayList;
import java.util.List;

public class Setor {
    private List<Funcionario> funcionarioSemTreinamento = new ArrayList<Funcionario>();

    public void adicionarFuncionarioSemTreinamento(Funcionario funcionario){
        if(funcionario == null)
            throw new NullPointerException("Funcionário não pode ser nulo.");

        this.funcionarioSemTreinamento.add(funcionario);
    }

    public boolean verificarCertificado(Funcionario funcionario){
        return this.funcionarioSemTreinamento.contains(funcionario);
    }
}