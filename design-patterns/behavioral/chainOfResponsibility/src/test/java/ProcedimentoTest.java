package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcedimentoTest {
    SetorFinanceiro financeiro;
    SetorAdministrativo administrativo;
    SetorSuporteTecnico tecnico;
    Atendente atendente;

    @BeforeEach
    void setUp() {
        administrativo = new SetorAdministrativo(null);
        financeiro = new SetorFinanceiro(administrativo);
        tecnico = new SetorSuporteTecnico(financeiro);
        atendente = new Atendente(tecnico);
    }
    @Test
    void deveRetornarAtendenteParaCadastroNovoCliente() {
        assertEquals("Atendente",atendente.registrarProcedimento(new OrdemServico(OrdemServicoCriacaoCadastramento.getProcedimentoCadastramento())));
    }
    @Test
    void deveRetornarSuporteAberturaDochamado() {
        assertEquals("Suporte Tecnico", atendente.registrarProcedimento(new OrdemServico(OrdemServicoCriacaoChamado.getProcedimentoChamado())));
    }
    @Test
    void deveRetornarFinanceiroBoleto() {
        assertEquals("Financeiro",atendente.registrarProcedimento(new OrdemServico(OrdemServicoCriacaoBoleto.getProcedimentoBoleto())));
    }
    @Test
    void deveRetornarAdmistrativoParaCancelamento() {
        assertEquals("Administrativo", atendente.registrarProcedimento(new OrdemServico(OrdemServicoCriacaoCancelamento.getProcedimentoCancelamento())));
    }
}
