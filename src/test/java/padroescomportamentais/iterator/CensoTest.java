package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarGaragem() {
        Garagem garagem = new Garagem(
                new Carro("fx1000", true),
                new Carro("fy1000", true),
                new Carro("fz1000", false),
                new Carro("ft1000", true)
        );
        assertEquals(3, ControleGaragem.contarCarrosGaragem(garagem));
    }

    @Test
    void deveContarTotalCarros() {
        Garagem garagem = new Garagem(
                new Carro("fx1000", false),
                new Carro("fy1000", true),
                new Carro("fz1000", false),
                new Carro("ft1000", true)
        );
        assertEquals(4, ControleGaragem.contarTotalGaragem(garagem));
    }

}