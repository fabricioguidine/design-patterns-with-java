package org.example;

import java.util.Iterator;

public class Censo {

    public static Integer contarColaboradoresAtivosSetor(Setor setor) {
        int quantidade = 0;
        for (Colaborador colaborador : setor) {
            if (colaborador.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalColaboradoresSetor(Setor setor) {
        int quantidade = 0;
        for (Iterator a = setor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}