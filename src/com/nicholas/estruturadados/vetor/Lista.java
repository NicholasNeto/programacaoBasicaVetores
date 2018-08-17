package com.nicholas.estruturadados.vetor;
import com.nicholas.estruturadados.basica;



public class Lista<T> extends basica<T> {

    private T[] listaElementos;
    private int tamanho;


    public Lista(int capacidade) {
        this.listaElementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }


    public void removeByPosition(int posicao){

        isPositionValid(posicao);

        for(int contador = posicao; contador < this.tamanho-1; contador++){
            this.listaElementos[contador] = this.listaElementos[contador+1];
        }
        this.tamanho--;
    }

    public void removeByElement(T posicao){

        int pos = busca(posicao);
        if(isPositionValid(pos)){
            removeByPosition(pos);
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

        isPositionValid(posicao);
        aumentaCapacidade();

        for(int contador = tamanho - 1; contador >= posicao; contador--){
            listaElementos[contador + 1 ] = listaElementos[contador];
        }

        listaElementos[posicao] = elemento;
        tamanho++;

        return true;
    }

    public T busca(int posicao) {


        return listaElementos[posicao];
    }


    public int busca(T elemento){

        for (int posicao = 0; posicao < tamanho; posicao++) {
            if(listaElementos[posicao].equals(elemento)){
                return posicao;
            }
        }
        return -1;
    }

    public int lastIndexOf(T elemento) {

        for (int posicao = this.tamanho-1; posicao > 0; posicao--) {
            if(listaElementos[posicao].equals(elemento)){
                return posicao;
            }
        }
        return -1;
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
