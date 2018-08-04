import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.nicholas.estruturadados.vetor.Vetor;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Aula008 {

    Vetor vetor;

    @BeforeEach
    public void sertUp(){

        vetor =  new  Vetor(3);

        vetor.add("B");
        vetor.add("D");
        vetor.add("E");

        vetor.add(0, "A");
        vetor.add(2,"C");

    }

    @Test
    public void deveAumentarAcapacidadeDoVetor(){
        assertEquals(6, vetor.capacidade());
    }
}
