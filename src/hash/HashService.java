package hash;

public class HashService {
    public void adcionar(String sigla, String estado, ListaEncadeada[] array){
        int posicao = calculoHash(sigla, array.length);
        if(array[posicao] == null){
            array[posicao] = new ListaEncadeada(new Nodo(sigla, estado));
        }else{
            array[posicao].adcionar(sigla, estado);
        }

    }
    private int calculoHash(String sigla, int tamanhoArray){
        char [] letra =  sigla.toCharArray();
        return  ((int)letra[0] +  (int)letra[1]) % tamanhoArray;
    }

}
