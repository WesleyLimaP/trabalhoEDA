package hash;

public class ListaEncadeada {
    private Nodo inicio;

    public ListaEncadeada() {
    }

    public ListaEncadeada(Nodo inicio) {
        this.inicio = inicio;
    }

    public void adcionar(String sigla, String estado){
        Nodo nodo = new Nodo(sigla, estado);
        if(inicio == null){
            inicio = nodo;
        }
            Nodo antigoInicio = inicio;
            inicio = nodo;
            nodo.setProximo(antigoInicio);

    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return "{" +
                "inicio=" + inicio +
                '}';
    }
}
