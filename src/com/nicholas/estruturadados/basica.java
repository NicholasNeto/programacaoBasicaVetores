package com.nicholas.estruturadados;

public class basica<T> {

    protected T[] listaElementos;
    protected int tamanho;

    public basica(int capacidade) {
        this.listaElementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public basica(){
        this(10);
    }

    private void aumentaCapacidade() {
        if (tamanho == listaElementos.length) {

            T[] novaListaDeElementos = (T[]) new Object[listaElementos.length * 2];

            for (int contador = 0; contador < listaElementos.length; contador++) {
                novaListaDeElementos[contador] = listaElementos[contador];
            }
            this.listaElementos = novaListaDeElementos;
        }
    }


    protected boolean add(T elemento) {
        aumentaCapacidade();
        if (tamanho < listaElementos.length) {
            listaElementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    protected boolean add(int posicao, T elemento) {

        aumentaCapacidade();
        isPositionValid(posicao);

        for(int contador = tamanho - 1; contador >= posicao; contador--){
            listaElementos[contador + 1 ] = listaElementos[contador];
        }

        listaElementos[posicao] = elemento;
        tamanho++;

        return true;
    }

    public boolean isPositionValid(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Position Invalid");
        }
        return true;
    }


}
