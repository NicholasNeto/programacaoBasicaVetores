package com.nicholas.estruturadados;

public class basica<T> {

    private T[] listaElementos;
    private int tamanho;

    public basica(int capacidade) {
        this.listaElementos = (T[]) new Object[capacidade];
        tamanho = 0;
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


    public boolean add(T elemento) {
        aumentaCapacidade();
        if (tamanho < listaElementos.length) {
            listaElementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean add(int posicao, T elemento) {

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


    @Override
    public String toString() {

        StringBuilder superString = new StringBuilder();
        superString.append("[");

        for(int contador = 0; contador < tamanho -1 ; contador++){
            superString.append(listaElementos[contador]);
            superString.append(", ");
        }

        if( tamanho > 0 ){
            superString.append(listaElementos[tamanho - 1 ]);
        }

        superString.append("]");
        return superString.toString();
    }
}
