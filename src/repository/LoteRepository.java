package repository;

import model.Lote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteRepository {

    private Map<Long, Lote> repository;

    public LoteRepository() {
        this.repository = new HashMap<>();
    }

    public Lote salvar(Lote lote) {
        Long id = Long.valueOf(repository.size()+1);

        this.repository.put(id, lote);
        return this.repository.get(id);
    }

    public List<Lote> listar() {
        return new ArrayList<>(this.repository.values());
    }
}
