package com.nicholas.estruturadados.vetor.AulasListas.exerciciosListas;

import com.nicholas.estruturadados.vetor.Lista;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class testExerc01 {

    /*
        Melhore a classe Lista e implemente o método contém, semelhante ao método contains da classe ArrayList
    */

    Lista<String> list;

    @BeforeEach
    public void setUp(){

        list = new Lista(6);

        list.add("A");
        list.add("B");
        list.add("C");
    }

    @Test
    public void deveRetornarVerdadeiroCasoEncontreOElementoNaLista() {

        assertTrue(list.contains("C"));
    }

    @Test
    public void deveRetornarFalsoCasoNãoEncontreOElementoNaLista(){

        assertFalse(list.contains("E"));
    }
}
