package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Setor implements Iterable<Colaborador>{

    private List<Colaborador> colaboradores = new ArrayList<Colaborador>();

    public Setor(Colaborador... colaboradores) {
        this.colaboradores = Arrays.asList(colaboradores);
    }

    @Override
    public Iterator<Colaborador> iterator() {
        return colaboradores.iterator();
    }
}