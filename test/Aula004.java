import com.nicholas.estruturadados.vetor.Vetor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aula004 {

    @Test
    public void shoulGetSizeOfArrary(){

        Vetor vetor = new Vetor(6);

        vetor.add("Primeiro");
        vetor.add("Segundo");
        vetor.add("Terceiro");

        int expectSize = 3;

        assertEquals(expectSize, vetor.tamanho());

    }

    @Test
    public void shouldShowAllElementos(){

        Vetor vetor = new Vetor(6);

        vetor.add("Primeiro");
        vetor.add("Segundo");
        vetor.add("Terceiro");

        String expectElementos = "[Primeiro, Segundo, Terceiro]";

        assertEquals(expectElementos, vetor.toString());

    }
}
