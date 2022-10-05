package model;

import java.util.Date;

public class Lote {
    private Produto produto;
    private int quantidade;
    private Date dataValidade;


    public Lote(Produto produto, int qtd, Date data) {
        this.produto = produto;
        this.quantidade = qtd;
        this.dataValidade = data;
    }

    @Override
    public String toString() {
        String produto = "\n{\n" + this.produto.toString() +"}\n";
        String quantidade = "Quantidade: " + String.valueOf(this.quantidade);
        String dataValidade = "Data validade: " + String.valueOf(this.dataValidade.getDay()) +"/"+ this.dataValidade.getMonth() +"/"+ String.valueOf(this.dataValidade.getYear());
        return "Lote:" + produto + quantidade + "\n" + dataValidade + "\n";
    }
}
