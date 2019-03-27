/*
 * Faça um programa Java que envia interrupções para as
 * threads dos exercícios anteriores. As threads devem fazer o
 * tratamento dessas interrupções e realizar uma finalização
 * limpa.
 */
package Ativ2;

/**
 *
 * @author tuchinski
 */
public class Ex3 {
    public static void main(String[] args) {
        String fileName = "quotes.txt";
        
        // cria uma thread que lê os arquivos e logo em seguida a interrompe
        Thread readFile = new Thread(new MyThreadReadFile(fileName));
        readFile.start();
        readFile.interrupt();
        
        // cria uma thread que fica parada com um tempo aleatório
        // e em seguida a interrompe
        Thread threadRandom = new MyThreadRdn();
        threadRandom.start();
        threadRandom.interrupt();        
    }
    
}


