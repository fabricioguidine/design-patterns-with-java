package org.example;
public class MotoBuilder {
    private Moto moto;

    public MotoBuilder(){
        moto = new Moto();
    }
    public Moto build(){
        if(moto.getMarca() == ""){
            throw new IllegalArgumentException("Marca inválida.");
        }
        if(moto.getModelo() == ""){
            throw new IllegalArgumentException("Modelo inválido.");
        }
        if(moto.getAno() == 0){
            throw new IllegalArgumentException("Ano inválido.");
        }
        return moto;
    }
    public MotoBuilder setMarca(String marca) {
        moto.setMarca(marca);
        return this;
    }
    public MotoBuilder setModelo(String modelo) {
        moto.setModelo(modelo);
        return this;
    }
    public MotoBuilder setAno(int ano) {
        moto.setAno(ano);
        return this;
    }
    public MotoBuilder setCor(String cor) {
        moto.setCor(cor);
        return this;
    }
    public MotoBuilder setCilindrada(String cilindrada) {
        moto.setCilindrada(cilindrada);
        return this;
    }
    public MotoBuilder setPotencia(String potencia) {
        moto.setPotencia(potencia);
        return this;
    }
    public MotoBuilder setChassi(String chassi) {
        moto.setChassi(chassi);
        return this;
    }
    public MotoBuilder setPlaca(String placa) {
        moto.setPlaca(placa) ;
        return this;
    }
    public MotoBuilder settipoMotor(int tipoMotor) {
        moto.setTipoMotor(tipoMotor);
        return this;
    }
    public MotoBuilder setPreco(int preco) {
        moto.setPreco(preco);
        return this;
    }
}