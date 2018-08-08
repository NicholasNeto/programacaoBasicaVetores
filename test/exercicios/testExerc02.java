package exercicios;

import com.nicholas.estruturadados.vetor.Lista;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testExerc02 {

    /*
        Melhore a classe Lista implementando o metodo ultimo indice, semelhante ao metodo lastIndexOf da classe arrayList

     */

    Lista list;


    @BeforeEach
    public void setUp(){

        list = new Lista(6);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
    }

    @Test
    public void deveRetornarOIndexDaUltimaPosicaoDoElementoBuscado() {

       assertEquals(3, list.lastIndexOf("A"));

    }

    @Test
    public void deveRetornarNegativoCasoOELementoNãoSejaEncontrado(){

        assertEquals(-1, list.lastIndexOf("E"));

    }


}
