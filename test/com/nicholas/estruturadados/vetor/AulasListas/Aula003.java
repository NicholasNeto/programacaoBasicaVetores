package com.nicholas.estruturadados.vetor.AulasListas;

import com.nicholas.estruturadados.vetor.Vetor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Aula003 {

    @Test
    public void shouldAddAnElementToTheFirstPosition(){
        Vetor vetor = new Vetor(5);
        vetor.add("Elemento 1");
//        assertEquals(vetor.listaElementos[0],"Elemento 1" );

    }

    @Test
    public void shouldAddAnElementTrue(){
        Vetor vetor = new Vetor(3);
        assertTrue(vetor.add("Elemento 1"));
    }

}
