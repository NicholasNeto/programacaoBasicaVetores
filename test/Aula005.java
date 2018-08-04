import com.nicholas.estruturadados.vetor.Vetor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Aula005 {

    @Test
    public void shouldReturnSucessfluElement(){

        Vetor vetor = new Vetor(6);

        vetor.add("Primeiro");
        String expectMesasagePositionInvalid = "Primeiro";

        assertEquals(expectMesasagePositionInvalid, vetor.busca(0));
    }

//    @Test
//    public void shouldReturnPositionInvalid(){
//
//        Vetor vetor = new Vetor(6);
//        vetor.add("Primeiro");
//        String expectMesasagePositionInvalid = "Position Invalid";
//        assertEquals(expectMesasagePositionInvalid, vetor.busca(13));
//
//    }
}
