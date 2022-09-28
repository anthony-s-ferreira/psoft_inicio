import models.Lote;
import models.Produto;

import java.util.Date;

public class Main {

    public static void main(String args[]) {
        Produto bicicleta = new Produto(1l, "VB Lazer","Monark", 1998.50);
        Lote lote = new Lote(1l, bicicleta, 1, new Date(1990, 8, 17));
    }
}
