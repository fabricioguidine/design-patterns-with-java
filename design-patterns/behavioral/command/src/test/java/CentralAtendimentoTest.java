import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralAtendimentoTest {
    CentralAtendimento centralAtendimento;
    Ticket ticket;

    @BeforeEach
    void setUp() {
        centralAtendimento = new CentralAtendimento();
        ticket = new Ticket (1999, "Teste 1", "Fabrício Guidine");
    }

    @Test
    void deveAbrirTicket() {
        Tarefa aberturaReclamacao = new AberturaTicketTarefa(ticket);
        centralAtendimento.executarTarefa(aberturaReclamacao);
        assertEquals("Reclamacao aberta", ticket.getSituacao());
    }

    @Test
    void deveFecharTicket() {
        Tarefa fechamentoReclamacao = new FechamentoTicketTarefa(ticket);
        centralAtendimento.executarTarefa(fechamentoReclamacao);
        assertEquals("Reclamacao fechada", ticket.getSituacao());
    }

    @Test
    void deveCancelarFechamentoTicket() {
        Tarefa aberturaReclamacao = new AberturaTicketTarefa(ticket);
        Tarefa fechamentoReclamacao = new FechamentoTicketTarefa(ticket);
        centralAtendimento.executarTarefa(aberturaReclamacao);
        centralAtendimento.executarTarefa(fechamentoReclamacao);
        centralAtendimento.cancelarUltimaReclamacao();
        assertEquals("Reclamacao aberta", ticket.getSituacao());
    }
}