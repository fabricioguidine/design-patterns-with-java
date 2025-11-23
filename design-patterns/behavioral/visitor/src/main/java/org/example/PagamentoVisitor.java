package org.example;

public class PagamentoVisitor implements Visitor {

    public String exibir(Pagamento pagamento) {
        return pagamento.aceitar(this);
    }

    @Override
    public String exibirPagamentoPix(PagamentoPix pagamentoPix) {
        return "PagamentoPix{" +
                "chave Pix=" + pagamentoPix.getChavePix() +
                ", valor=" + pagamentoPix.getValor() +
                '}';
    }

    @Override
    public String exibirPagamentoCartaoCredito(PagamentoCartaoCredito pagamentoCartaoCredito) {
        return "PagamentoCartaoCredito{" +
                "numero cartao=" + pagamentoCartaoCredito.getNumeroCartao() +
                ", validade='" + pagamentoCartaoCredito.getValidade() + '\'' +
                ", codigo seguranca='" + pagamentoCartaoCredito.getCodigoSeguranca() + '\'' +
                ", valor=" + pagamentoCartaoCredito.getValor() +
                '}';
    }

    @Override
    public String exibirPagamentoBoleto(PagamentoBoleto pagamentoBoleto) {
        return "PagamentoBoleto{" +
                "codigoBarras=" + pagamentoBoleto.getCodigoBarras() +
                ", valor=" + pagamentoBoleto.getValor() +
                '}';
    }

}