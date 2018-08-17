package com.nicholas.estruturadados.vetor;
import com.nicholas.estruturadados.basica;

public class Lista2<T> extends basica {


    public Lista2 (){
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }



    public boolean adiciona(T elemento){
        return super.add(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.add(posicao, elemento);
    }
}
