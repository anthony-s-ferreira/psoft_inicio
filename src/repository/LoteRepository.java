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
        this.repository.put(lote.getId(), lote);
        return this.repository.get(lote.getId());
    }

    public List<Lote> listar() {
        return new ArrayList<>(this.repository.values());
    }

    public int getSize() {
        return this.repository.size();
    }
}
