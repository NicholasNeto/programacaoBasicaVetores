import com.nicholas.estruturadados.vetor.Vetor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Aula007 {

    Vetor vetor;

    @BeforeEach
    public void setUp(){
        vetor = new Vetor(10);

        vetor.add("B");
        vetor.add("E");
        vetor.add("F");
    }



    @Test
    public void deveAdicionarUmElementoNoComeçoDaLista(){
        vetor.add(0 , "A");
        String expectElementA = "A";

        assertTrue(expectElementA.equals(vetor.busca(0)));
    }

    @Test
    public void deveAdicionarUmelementoNoMeioDaLista(){

        vetor.add(0 , "A");
        vetor.add(2, "C");

        String expectElementC = "C";

        assertTrue(expectElementC.equals(vetor.busca(2)));

    }

    @Test
    public void deveIncrementarOTamanhoAposAdiocionarUmElemento(){

        assertEquals(3, vetor.tamanho());
        int expectativaAposIncrementto = 6;

        vetor.add(0,"A");
        vetor.add(2,"C");
        vetor.add("G");

        assertEquals(expectativaAposIncrementto, vetor.tamanho());
    }
}
