package org.example;

public class PagamentoPix implements Pagamento {

    private String chavePix;
    private float valor;

    public PagamentoPix(String chavePix, float valor) {
        this.chavePix = chavePix;
        this.valor = valor;
    }

    public String getChavePix() {
        return chavePix;
    }

    public float getValor() {
        return valor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPagamentoPix(this);
    }

}

