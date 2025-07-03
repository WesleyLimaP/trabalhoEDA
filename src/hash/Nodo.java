package hash;

public class Nodo {
    private String sigla;
    private String estado;
    private Nodo proximo;

    public Nodo(String sigla, String estado, Nodo proximo) {
        this.sigla = sigla;
        this.estado = estado;
        this.proximo = proximo;
    }

    public Nodo() {
    }

    public Nodo(String sigla, String estado) {
        this.estado = estado;
        this.sigla = sigla;
        this.proximo = null;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

}
