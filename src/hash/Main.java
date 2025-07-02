package hash;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TabelaHash hash = new TabelaHash(new ListaEncadeada[10], new HashService());

        System.out.println(hash);

        hash.getHashService().adcionar("RJ", "Rio de janeiro", hash.getArray());
        hash.getHashService().adcionar("RJ", "Rio de janeiro", hash.getArray());

        System.out.println(hash);
    }
}