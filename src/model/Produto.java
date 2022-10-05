package model;

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

    @Override
    public String toString() {
        String id = String.valueOf(this.id);
        String nome = "Nome: " + this.nome;
        String fabricante = "Fabricante: " + this.fabricante;
        String preco = "Preço: R$" + String.valueOf(this.preco);

        return "Produto "+ id + ": \n" + nome + "\n" + fabricante + "\n" + preco + "\n";
    }

    public Long getId() {
        return id;
    }
}
