package org.example;
public class ServicoBoleto implements IServico {
    @Override
    public String executar() {
        return "Pagamento por Boleto Bancário.";
    }
    @Override
    public String cancelar() {
        return "Pagamento cancelado.";
    }
}
