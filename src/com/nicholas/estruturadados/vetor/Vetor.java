package com.nicholas.estruturadados.vetor;

public class Vetor {

    private String[] listaElementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.listaElementos = new String[capacidade];
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

            String[] novaListaDeElementos = new String[listaElementos.length * 2];

            for (int contador = 0; contador < listaElementos.length; contador++) {
                novaListaDeElementos[contador] = listaElementos[contador];
            }
            this.listaElementos = novaListaDeElementos;
        }
    }

    public void remove(int posicao){

        isPositionValid(posicao);

        for(int contador = posicao; contador < this.tamanho-1; contador++){
            listaElementos[contador] = listaElementos[contador+1];
        }
        this.tamanho--;
    }


    public boolean add(String elemento) {
        aumentaCapacidade();
        if (tamanho < listaElementos.length) {
            listaElementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean add(int posicao, String elemento) {

         aumentaCapacidade();
         isPositionValid(posicao);

        for(int contador = tamanho - 1; contador >= posicao; contador--){
            listaElementos[contador + 1 ] = listaElementos[contador];
        }

        listaElementos[posicao] = elemento;
        tamanho++;

        return true;
    }

    public String busca(int posicao) {
        isPositionValid(posicao);
        return listaElementos[posicao];
    }


    public int busca(String elemento){

      for (int posicao = 0; posicao < tamanho; posicao++) {
          if(listaElementos[posicao].equals(elemento)){
              return posicao;
          }
      }
        return -1;
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

    public void isPositionValid(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Position Invalid");
        }
    }
}
