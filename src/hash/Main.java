package hash;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TabelaHash hash = new TabelaHash(new ListaEncadeada[10], new HashService());



        hash.getHashService().adcionar("RJ", "Rio de janeiro", hash.getArray());
        hash.getHashService().adcionar("PB", "Paraiba", hash.getArray());
        hash.getHashService().adcionar("SC", "Paraiba", hash.getArray());
        hash.getHashService().adcionar("RN", "Paraiba", hash.getArray());
        hash.getHashService().adcionar("MS", "Paraiba", hash.getArray());
        hash.getHashService().adcionar("GO", "Paraiba", hash.getArray());


        System.out.println(hash);
    }
}