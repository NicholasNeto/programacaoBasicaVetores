package com.nicholas.estruturadados.vetor;

public class Vetor {

    //public String[] listaElementos;
    private  String[] listaElementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.listaElementos = new String[capacidade];
        tamanho = 0;
    }


  public boolean add(String elemento){
       if( tamanho < listaElementos.length){
           listaElementos[tamanho] = elemento;
           tamanho++;
           return true;
       }
        return false;
  }


  public int tamanho(){
        return this.tamanho;
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
