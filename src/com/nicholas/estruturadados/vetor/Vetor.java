package com.nicholas.estruturadados.vetor;

public class Vetor {

    public String[] elementos;
    // private  String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }

//    public void adiciona(String elemento){
//        for(int contador = 0; contador < elementos.length; contador++) {
//            if(elementos[contador] == null ){
//                elementos[contador] = elemento;
//                break;
//            }
//        }
//    }



  public boolean add(String elemento){
       if( tamanho < elementos.length){
           elementos[tamanho] = elemento;
           tamanho++;
           return true;
       }
        return false;
  }
}
