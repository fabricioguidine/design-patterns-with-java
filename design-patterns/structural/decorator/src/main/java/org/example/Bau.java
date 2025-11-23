package org.example;

public class Bau extends MotoDecorator {

    public Bau(Moto moto) {
        super(moto);
    }

    public float getPrecoPeca() {
        return 2000;
    }

    public String getCustomPeca() {
        return "Baú";
    }
}
