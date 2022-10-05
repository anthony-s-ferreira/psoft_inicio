package service;

import model.Lote;
import model.Produto;
import repository.LoteRepository;
import repository.ProdutoRepository;

import java.util.Date;
import java.util.List;

public class LoteService {

    private LoteRepository loteRepository;

    public LoteService() {
        this.loteRepository = new LoteRepository();
    }


    public Lote salvar(Produto produto, int quantidade, Date data_validade) {
        Long id = Long.valueOf(this.loteRepository.getSize() +1);
        return this.loteRepository.salvar(new Lote(id, produto, quantidade, data_validade));
    }

    public List<Lote> listar() {
        return this.loteRepository.listar();
    }
}
