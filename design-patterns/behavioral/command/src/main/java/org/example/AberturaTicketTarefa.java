package org.example;

public class AberturaTicketTarefa implements Tarefa{
    private Ticket ticket;

    public AberturaTicketTarefa(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void executar() {
        this.ticket.abrirTicket();
    }

    @Override
    public void cancelar() {
        this.ticket.fecharTicket();
    }
}
