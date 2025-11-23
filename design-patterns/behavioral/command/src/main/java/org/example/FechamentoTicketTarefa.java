package org.example;

public class FechamentoTicketTarefa implements Tarefa {
    private Ticket ticket;

    public FechamentoTicketTarefa(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void executar() {
        this.ticket.fecharTicket();
    }

    @Override
    public void cancelar() {
        this.ticket.abrirTicket();
    }
}