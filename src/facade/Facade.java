package facade;

import model.Lote;
import model.Produto;
import service.LoteService;
import service.ProdutoService;

import java.util.Date;
import java.util.List;

public class Facade {

    private LoteService loteService;
    private ProdutoService produtoService;

    public Facade() {
        this.loteService = new LoteService();
        this.produtoService = new ProdutoService();
    }

    public Produto salvarProduto(String nome, String fabricante, double valor) {
        return this.produtoService.salvar(nome, fabricante, valor);
    }

    public List<Produto> listarProdutos() {
        return this.produtoService.listar();
    }

    public Lote salvarLote(Produto produto, int quantidade, Date data_validade) {
        return this.loteService.salvar(produto, quantidade, data_validade);
    }

    public List<Lote> listarLotes() {
        return this.loteService.listar();
    }
}
