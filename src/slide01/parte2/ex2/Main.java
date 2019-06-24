/*
 * Faça uma thread Java que realize a leitura de um arquivo
 * texto com frases e exiba as frases a cada 10 segundos.
 */
package slide01.parte2.ex2;

/**
 *
 * @author tuchinski
 */

public class Main {

    public static void main(String[] args) {
        String fileName = "quotes.txt";
        Thread t1 = new Thread(new MyThreadReadFile(fileName));
        t1.start();

        
    }
}
