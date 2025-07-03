package hash;

public class TabelaHash {
    private ListaEncadeada[] array;
    private HashService hashService;

    public TabelaHash(ListaEncadeada[] array, HashService hashService) {
        this.array = array;
        this.hashService = hashService;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
       for(int i = 0; i < array.length; i++) {
           if (array[i] != null) {
               stringBuilder.append(i).append(": ");
               while (array[i].getInicio() != null) {
                   stringBuilder.append(array[i]).append(" -> ");
                   array[i].setInicio(array[i].getInicio().getProximo());
               }
               stringBuilder.append(" none");
               stringBuilder.append("\n");
           } else {
               stringBuilder.append(i).append(": ").append(" none ").append("\n");
           }
       }

        return stringBuilder.toString();
           }



    public ListaEncadeada[] getArray() {
        return array;
    }

    public void setArray(ListaEncadeada[] array) {
        this.array = array;
    }

    public HashService getHashService() {
        return hashService;
    }

    public void setHashService(HashService hashService) {
        this.hashService = hashService;
    }



}
