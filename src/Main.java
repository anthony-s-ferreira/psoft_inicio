import facade.Facade;
import model.Lote;
import model.Produto;

import java.util.Date;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {
        Facade facade = new Facade();

        Produto arrozBranco = facade.salvarProduto("Arroz Branco", "Padrinhos", 7.50);
        Produto arrozParborizado = facade.salvarProduto("Arroz Parbolizado", "Padrinhos", 7);
        Produto feijaoPreto = facade.salvarProduto("Feijão Preto", "Troncs", 8.40);
        Produto feijaoVerde = facade.salvarProduto("Feijão Verde", "Scnort",7.90);

        facade.salvarLote(arrozBranco, 600, new Date(2023, 1, 20));
        facade.salvarLote(arrozParborizado, 600, new Date(2022, 11, 1));

        facade.salvarLote(feijaoPreto, 500, new Date(2023, 4, 17));
        facade.salvarLote(feijaoVerde, 550, new Date(2023, 2, 15));

        System.out.println(facade.listarProdutos().stream().map(Produto::toString).collect(Collectors.joining("\n")));
        System.out.println(facade.listarLotes().stream().map(Lote::toString).collect(Collectors.joining("\n")));
    }
}
