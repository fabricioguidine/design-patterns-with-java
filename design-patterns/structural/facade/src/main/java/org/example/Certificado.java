package org.example;

public class Certificado extends Setor {
    private static Certificado certificado = new Certificado();

    private Certificado(){};

    public static Certificado getInstancia(){
        return certificado;
    }
}
