package org.example;
public class Moto {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String cilindrada;
    private String potencia;
    private String chassi;
    private String placa;
    private int tipoMotor;
    private float preco;
    public Moto() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(int tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
}