package org.example;

public interface Visitor {

    String exibirPagamentoPix(PagamentoPix pagamentoPix);
    String exibirPagamentoCartaoCredito(PagamentoCartaoCredito pagamentoCartaoCredito);
    String exibirPagamentoBoleto(PagamentoBoleto pagamentoBoleto);
}
