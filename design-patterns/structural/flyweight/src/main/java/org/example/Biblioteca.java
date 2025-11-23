package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> estoque = new ArrayList<Livro>();

    public List<String> listarEstoque(){
        List<String> detalhesLivros = new ArrayList<String>();
        for(Livro livro : this.estoque){
            detalhesLivros.add(livro.getDetalhes());
        }
        return detalhesLivros;
    }

    public void registrarLivro(String nomeLivro, Float preco, String nomeFornecedor, String cidadeFornecedor, String estadoFornecedor){
        Fornecedor fornecedor = FornecedorFactory.getFornecedor(nomeFornecedor, cidadeFornecedor, estadoFornecedor);
        Livro livro = new Livro(nomeLivro, preco, fornecedor);
        estoque.add(livro);
    }
}
