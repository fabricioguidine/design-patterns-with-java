package org.example;

public class PagamentoBoleto implements Pagamento {

    private String codigoBarras;
    private float valor;

    public PagamentoBoleto(String codigoBarras, float valor) {
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public float getValor() {
        return valor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPagamentoBoleto(this);
    }

}

