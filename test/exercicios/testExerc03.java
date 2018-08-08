package exercicios;

import com.nicholas.estruturadados.vetor.Lista;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testExerc03 {

    Lista list;

    @BeforeEach
    public void setUp(){

        list = new Lista(6);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    @Test
    public void deveriaRemoverElementoEspecificoElementoPassado(){

        assertEquals(4, list.tamanho());
        list.removeByElement("A");
        assertEquals(3, list.tamanho());
    }
}
