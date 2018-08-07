import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nicholas.estruturadados.vetor.Vetor;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Aula009 {

    Vetor vetor;


    @BeforeEach
    public void setUp() {

        vetor = new Vetor(5);

        vetor.add("A");
        vetor.add("B");
        vetor.add("C");
        vetor.add("D");
    }


    @Test
    public void deveRemoverUmElementoDaLista(){

        assertEquals(4 , vetor.tamanho());
        vetor.remove(1);
        assertEquals(3 , vetor.tamanho());
    }


    @Test
    public void deveRemoverUmElementoEspecifico(){

        vetor.tamanho();
        int posicao = vetor.busca("A");
        vetor.remove(posicao);

        assertEquals(3, vetor.tamanho());
    }
}
