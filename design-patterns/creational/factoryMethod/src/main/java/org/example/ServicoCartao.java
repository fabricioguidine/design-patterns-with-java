package org.example;
public class ServicoCartao implements IServico {
    @Override
    public String executar() {
        return "Pagamento por Cartão de Crédito.";
    }
    @Override
    public String cancelar() {
        return "Pagamento cancelado.";
    }
}
