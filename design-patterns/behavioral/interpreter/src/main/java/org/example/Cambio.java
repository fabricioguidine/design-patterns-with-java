package org.example;

public class Cambio {

    public static String formula = "real / 5.2 + taxa";

    public static double calcularValor(double real, double taxa) {
        String expressao;
        expressao = formula.replace("real", Double.toString(real));
        expressao = expressao.replace("taxa", Double.toString(taxa));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}