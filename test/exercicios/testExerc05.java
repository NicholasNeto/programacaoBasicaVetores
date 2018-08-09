package exercicios;

import org.junit.jupiter.api.BeforeEach;

import com.nicholas.estruturadados.vetor.Lista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testExerc05 {


    Lista<String> list;

    @BeforeEach
    public void setUp(){
        list = new Lista<>(6);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    @Test
    public void deveTerOTamanho0AposremoverTodosOsElementos(){
        assertEquals(4 , list.tamanho());
        list.cleanElementos();
        assertEquals(0, list.tamanho());
    }
}
