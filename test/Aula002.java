
import com.nicholas.estruturadados.vetor.Vetor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Aula002 {

    @Test
    public void deveCriarUmaListaComCapacidadeIndicada(){
        Vetor vetor = new  Vetor(6);

        assertEquals(6, vetor.capacidade());
    }

}
