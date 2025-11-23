package org.example;
public class ServicoSaldo implements IServico {
    @Override
    public String executar() {
        return "Pagamento com saldo em conta.";
    }
    @Override
    public String cancelar() {
        return "Pagamento cancelado.";
    }
}
