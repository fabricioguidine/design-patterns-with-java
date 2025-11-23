package org.example;
public class Funcionario implements Cloneable {
    private int matricula;
    private String nome;
    private Declaracao declaracao;
    public Funcionario(int matricula, String nome, Declaracao declaracao) {
        this.matricula = matricula;
        this.nome = nome;
        this.declaracao = declaracao;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Declaracao getDeclaracao() {
        return declaracao;
    }
    public void setDeclaração(Declaracao declaracao){
        this.declaracao = this.declaracao;
    }
    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.declaracao = (Declaracao) funcionarioClone.declaracao.clone();
        return funcionarioClone;
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", declaracao=" + declaracao +
                '}';
    }
}