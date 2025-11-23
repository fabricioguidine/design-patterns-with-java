package org.example;
import java.util.ArrayList;
import java.util.List;
public class Gerente extends Pessoa {
    private List<Pessoa> pessoas;
    public Gerente(String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
        this.pessoas = new ArrayList<Pessoa>();
    }
    public void addSubordinado(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
    public String getInfo() {
        String output;
        output = "Gerente: " + this.getNome() + " / " + this.getCargo() + " / " + this.getMatricula() + "\n";
        for (Pessoa pessoa : pessoas) {
            output = output.concat(pessoa.getInfo());
        }
        return output;
    }
}
