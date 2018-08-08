package com.nicholas.estruturadados.vetor;

public class VetorObject {


    private Object[] listaElementos;
    private int tamanho;

    public VetorObject(int capacidade) {
        this.listaElementos = new Object[capacidade];
        tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int capacidade(){
        return this.listaElementos.length;
    }

    private void aumentaCapacidade() {
        if (tamanho == listaElementos.length) {

            Object[] novaListaDeElementos = new Object[listaElementos.length * 2];

            for (int contador = 0; contador < listaElementos.length; contador++) {
                novaListaDeElementos[contador] = listaElementos[contador];
            }
            this.listaElementos = novaListaDeElementos;
        }
    }

    public void remove(int posicao){

        isPositionValid(posicao);

        for(int contador = posicao; contador < this.tamanho-1; contador++){
            this.listaElementos[contador] = this.listaElementos[contador+1];
        }
        this.tamanho--;
    }


    public boolean add(Object elemento) {
        aumentaCapacidade();
        if (tamanho < listaElementos.length) {
            listaElementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean add(int posicao, Object elemento) {

        aumentaCapacidade();
        isPositionValid(posicao);

        for(int contador = tamanho - 1; contador >= posicao; contador--){
            listaElementos[contador + 1 ] = listaElementos[contador];
        }

        listaElementos[posicao] = elemento;
        tamanho++;

        return true;
    }

    public Object busca(int posicao) {

        isPositionValid(posicao);

        return listaElementos[posicao];
    }


    public int busca(Object elemento){

        for (int posicao = 0; posicao < tamanho; posicao++) {
            if(listaElementos[posicao].equals(elemento)){
                return posicao;
            }
        }
        return -1;
    }


    public void isPositionValid(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Position Invalid");
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
