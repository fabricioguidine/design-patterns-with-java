package org.example;

import java.util.ArrayList;
import java.util.List;
public class CentralAtendimento {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void executarTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaReclamacao(){
        if (tarefas.size() != 0) {
            Tarefa tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }

}