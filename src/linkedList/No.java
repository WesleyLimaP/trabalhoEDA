package linkedList;

public class No {
    private int numero;
    private Cor cor;
    private No proximo;

    public No(int valor, Cor cor,  No proximo) {
        this.numero = valor;
        this.cor = cor;
        this.proximo = proximo;
    }
    public No(int numero, Cor cor) {
        this.numero = numero;
        this.cor = cor;
        this.proximo = null;
    }

    public No() {

    }

    public No(Cor cor) {
        this.cor = cor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }


}
