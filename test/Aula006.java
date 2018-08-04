import com.nicholas.estruturadados.vetor.Vetor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class Aula006 {

    Vetor vetor;


    @BeforeEach
    public void setUp(){

        vetor = new Vetor(6);

        vetor.add("Primeiro");
        vetor.add("Segundo");
        vetor.add("Terceiro");

    }

    @Test
    public void shouldFindPositionOfElementInList(){


        int expectFirstPosition = 0;
        int expectSecondPosition = 1;


        assertEquals(expectFirstPosition ,vetor.busca("Primeiro"));
        assertEquals(expectSecondPosition ,vetor.busca("Segundo"));
    }


    @Test
    public void shouldReturnPositionNotFind(){

        int expectQuartPosition = -1;

        assertEquals(expectQuartPosition ,vetor.busca("Quart"));

    }
}
