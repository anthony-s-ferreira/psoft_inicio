package model;

import java.util.Date;

public class Lote {

    private Long id;
    private Produto produto;
    private int quantidade;
    private Date dataValidade;


    public Lote(Long id, Produto produto, int qtd, Date data) {
        this.id = id;
        this.produto = produto;
        this.quantidade = qtd;
        this.dataValidade = data;
    }

    @Override
    public String toString() {
        String id = String.valueOf(this.id);
        String produto = "\n{\n" + this.produto.toString() +"}\n";
        String quantidade = "Quantidade: " + String.valueOf(this.quantidade);
        String dataValidade = "Data validade: " + String.valueOf(this.dataValidade.getDay()) +"/"+ this.dataValidade.getMonth() +"/"+ String.valueOf(this.dataValidade.getYear());
        return "Lote "+id+":" + produto + quantidade + "\n" + dataValidade + "\n";
    }

    public Long getId() {
        return id;
    }

}
