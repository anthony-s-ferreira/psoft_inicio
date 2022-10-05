package model;

public class Produto {
    private String nome;
    private String fabricante;
    private double preco;

    public Produto(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String nome = "Nome: " + this.nome;
        String fabricante = "Fabricante: " + this.fabricante;
        String preco = "Preço: R$" + String.valueOf(this.preco);

        return "Produto: \n" + nome + "\n" + fabricante + "\n" + preco + "\n";
    }
}
