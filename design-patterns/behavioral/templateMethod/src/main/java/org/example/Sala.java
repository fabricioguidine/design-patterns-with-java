package org.example;

public abstract class Sala {

    private String numero;
    private Boolean ocupado;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public abstract Double getTempo();

    public abstract String getTipo();

    public String getInfo(){
        return
                "{\n" +
                        "   numero: " + getNumero() + ",\n" +
                        "   tempo: " + getTempo() + ",\n" +
                        "   tipo: " + getTipo() + "\n" +
                        "}";
    }

    public Double simularEstadia(Integer dias){
        return dias * getTempo();
    }
}