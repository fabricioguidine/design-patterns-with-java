package org.example;
import java.util.HashMap;
import java.util.Map;

public class FornecedorFactory {

    private static Map<String, Fornecedor> fornecedores = new HashMap<>();

    public static Fornecedor getFornecedor(String nome, String cidade, String estado){

        Fornecedor fornecedor = fornecedores.get(nome);
        if (fornecedor == null){
            fornecedor = new Fornecedor(nome, cidade, estado);
            fornecedores.put(nome, fornecedor);
        }
        return fornecedor;
    }

    public static Integer getQuantidadeFornecedores(){ return fornecedores.size(); }
}