package org.example;

public class Funcionario {
    public boolean liberado(){
        return FuncionarioFacade.verificarPendenciaFuncionario(this);
    }
}
