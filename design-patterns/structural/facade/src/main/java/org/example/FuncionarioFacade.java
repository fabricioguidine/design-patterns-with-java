package org.example;

public class FuncionarioFacade {
    public static boolean verificarPendenciaFuncionario(Funcionario funcionario) {
        if(Certificado.getInstancia().verificarCertificado(funcionario))
            return false;
        if(Gerente.getInstancia().verificarCertificado(funcionario))
            return false;
        if(Treinamento.getInstancia().verificarCertificado(funcionario))
            return false;

        return true;
    }
}
