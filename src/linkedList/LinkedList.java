package linkedList;

import linkedList.Cor;

public class LinkedList {
    private No inicio;


    public LinkedList() {
    }

    public void atenderPAciente(){
        if(inicio == null){
            System.out.println("Não ah pacientes");
            return;
        }
        No paciente = inicio;
        inicio = inicio.getProximo();
        System.out.println("atendendo paciente cartão cor " + paciente.getCor() + " e número " + paciente.getNumero());
    }

    public void inserirSemPrioridade(No nodo) {
        No ultimo = pegarUltimo();
        ultimo.setProximo(nodo);
    }
    public void inserirComPrioridade( No nodo) {
        if(inicio.getProximo() == null && inicio.getCor() == Cor.VERMELHO){ //se houver apenas um paciente na lista e esse paciente for vermelho, o incio vai apontar pro novo nodo
            nodo.setProximo(inicio);
            inicio = nodo;
            return;
        }
        No ultimo = pegarUltimoAmarelo();
        if (ultimo.getCor() == Cor.VERMELHO){ //se a lista so tiver vermelhos, aponta o inicio pro novo nodo
            nodo.setProximo(inicio);
            inicio = nodo;
            return;
        }
        nodo.setProximo(ultimo.getProximo());
        ultimo.setProximo(nodo);

    }


    public void inserir(Cor cor) {
        No nodo = new No(cor);
        if(inicio == null){ // verifica se a lista ta vazia e adciona diretamente o nodo
            if(cor == Cor.VERMELHO){
                nodo.setNumero(1);
                inicio = nodo;
                return;
            }else{
                nodo.setNumero(201);
                inicio = nodo;
                return;
            }
        }
        if (cor == Cor.VERMELHO) { //se a cor do novo nodo for vermelha e a lista tiver apenas pacientes amarelos, vai adcioinar 1 ao numero do nodo e chama o metodo de inserir sem prioridade
            No ultimo = pegarUltimo();
            if ( ultimo.getCor() == Cor.AMARELO) {
                nodo.setNumero(1);
                inserirSemPrioridade(nodo);
                return;
            }
            nodo.setNumero(ultimo.getNumero() + 1); // se a codição acima for negativa, ou seja, se houver pacientes vermelhos, vai adcionar ao numero do nodo +1 a partir do numero da ultimo vermelho
            inserirSemPrioridade(nodo);
            return;
        }
        No ultimo = pegarUltimoAmarelo();
        if (ultimo.getCor() == Cor.VERMELHO) { //se houver apenas paciente vermelhos, vai adcionar o 201 ao numero do nodo e adcinar a fila com prioridade
            nodo.setNumero(201);
            inserirComPrioridade(nodo);
            return;
        }
        nodo.setNumero(ultimo.getNumero() + 1); // se houver pacientes amarelos, vai encrementar +1
        inserirComPrioridade(nodo);

    }
    private No pegarUltimo(){
        No ultimo = inicio;

        if(ultimo == null){
            return ultimo;
        }
        while (ultimo.getProximo() != null){
            ultimo = ultimo.getProximo();
        }
        return ultimo;
    }
    private No pegarUltimoAmarelo(){
        No ultimo = inicio;

        if(ultimo == null || ultimo.getProximo() == null){ // se a lista tiver vazia ou se tiver apenas 1 elemento, vai retornar o inicio sem precisar percorrer a lista
            return ultimo;
        }
        while (ultimo.getProximo() != null && ultimo.getProximo().getCor() == Cor.AMARELO){ //percorre ate achar o ultimo amarelo
            ultimo = ultimo.getProximo();
        }

        return ultimo;
    }


    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }


    public void imprimirListEspera() {
        if(inicio == null){
            return;
        }
        No atual = inicio;
        while (atual.getProximo() != null){
            System.out.print("["+atual.getCor() + "," + atual.getNumero() + "]");
            atual = atual.getProximo();
        }
        System.out.println("["+atual.getCor() + "," + atual.getNumero() + "]");

    }
}
