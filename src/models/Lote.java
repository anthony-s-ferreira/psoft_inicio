package models;

import java.util.Date;

public class Lote {

    private Long id;
    private Produto produto;
    private int qtd;
    private Date data;


    public Lote(Long id, Produto produto, int qtd, Date data) {
        this.id = id;
        this.produto = produto;
        this.qtd = qtd;
        this.data = data;
    }

}
