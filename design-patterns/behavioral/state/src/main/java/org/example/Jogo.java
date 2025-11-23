package org.example;
public class Jogo {
    private String nome;
    private JogoEstado estado;
    public Jogo() {
        this.estado = Start.getInstance();
    }
    public void setEstado(JogoEstado estado) {
        this.estado = estado;
    }
    public String comecar() {
        return estado.comecar(this);
    }
    public String jogar() {
        return estado.jogar(this);
    }
    public String perder() {
        return estado.perder(this);
    }
    public String ganhar() {
        return estado.ganhar(this);
    }
    public String pausar() {
        return estado.pausar(this);
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public JogoEstado getEstado() {
        return estado;
    }
}

