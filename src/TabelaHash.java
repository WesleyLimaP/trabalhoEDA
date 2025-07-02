import java.util.Arrays;
import java.util.List;

public class TabelaHash {
    private ListaEncadeada [] array;
    private HashService hashService;

    public TabelaHash(ListaEncadeada[] array, HashService hashService) {
        this.array = array;
        this.hashService = hashService;
    }

    @Override
    public String toString() {
        return  Arrays.toString(array);
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
