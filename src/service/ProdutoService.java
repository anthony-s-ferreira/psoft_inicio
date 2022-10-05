package service;

import model.Produto;
import repository.ProdutoRepository;

import java.util.List;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.produtoRepository = new ProdutoRepository();
    }


    public Produto salvar(String nome, String fabricante, double valor) {
        return this.produtoRepository.salvar(new Produto(nome, fabricante, valor));
    }

    public List<Produto> listar() {
        return this.produtoRepository.listar();
    }
}
