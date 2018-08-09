package com.nicholas.estruturadados.vetor.AulasListas;

import com.nicholas.estruturadados.vetor.Vetor;
import org.junit.jupiter.api.Test;

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

    public static class Aula002 {

        @Test
        public void deveCriarUmaListaComCapacidadeIndicada(){
            Vetor vetor = new  Vetor(6);

            assertEquals(6, vetor.capacidade());
        }

    }
}
