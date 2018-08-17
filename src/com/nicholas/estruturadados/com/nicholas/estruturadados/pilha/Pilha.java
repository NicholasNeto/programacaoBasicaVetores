package com.nicholas.estruturadados.com.nicholas.estruturadados.pilha;

import com.nicholas.estruturadados.basica;


public class Pilha<T> extends basica<T> {

    public Pilha(){
        super();
    }

    public Pilha (int capacidade){
        super(capacidade);
    }


    public void empilha(T elemento){
        super.add(elemento);
    }


}
