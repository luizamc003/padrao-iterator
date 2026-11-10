package padroescomportamentais.iterator;

import java.util.Iterator;

public class ControleGaragem {

    public static Integer contarCarrosGaragem(Garagem garagem) {
        int quantidade = 0;
        for (Carro carro : garagem) {
            if (carro.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalGaragem(Garagem garagem) {
        int quantidade = 0;
        for (Iterator a = garagem.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}