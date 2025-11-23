package org.example;

public class Ticket {
    private int protocolo;
    private String assunto;
    private String nomeCliente;
    private String situacao;

    public Ticket(int protocolo, String assunto, String nomeCliente) {
        this.protocolo = protocolo;
        this.assunto = assunto;
        this.nomeCliente = nomeCliente;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirTicket(){
        this.situacao = "Reclamacao aberta";
    }

    public void fecharTicket(){
        this.situacao = "Reclamacao fechada";
    }
}