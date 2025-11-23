package org.example;
public class ServicoPix implements IServico {
    @Override
    public String executar() {
        return "Pagamento por Pix.";
    }
    @Override
    public String cancelar() {
        return "Pagamento cancelado.";
    }
}
