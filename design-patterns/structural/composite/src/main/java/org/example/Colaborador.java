package org.example;
public class Colaborador extends Pessoa {
    public Colaborador(String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
    }
    public String getInfo() {
        return "Colaborador: " + this.getNome() + " / " + this.getCargo() + " / " + this.getMatricula() + "\n";
    }
}
