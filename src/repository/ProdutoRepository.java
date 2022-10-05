package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {

    private Map<Long, Produto> repository;


    public ProdutoRepository() {
        this.repository = new HashMap<Long, Produto>();
    }

    public Produto salvar(Produto produto) {
        Long id = Long.valueOf(repository.size()+1);

        this.repository.put(id, produto);
        return this.repository.get(id);
    }

    public List<Produto> listar() {
        return new ArrayList<>(this.repository.values());
    }
}
