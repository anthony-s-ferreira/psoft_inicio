package models;

import java.util.Date;

public class Produto {
    private Long id;

    private String nome;
    private String fabricante;
    private double preco;

    public Produto(Long id, String nome, String fabricante, double preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }
}
