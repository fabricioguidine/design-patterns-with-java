package org.example;
public class Honda implements Moto {

    public float preco;

    public Honda() {
    }

    public Honda(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getCustom() {
        return "Honda";
    }

}

