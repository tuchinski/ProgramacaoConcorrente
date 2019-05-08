/*
 *Faça um programa em Java que inicie três threads e, cada
thread, espere um tempo aleat ́orio para terminar
 */



package slide1.parte2.ex1;


/**
 *
 * @author tuchinski
 */


public class Main {
    public static void main(String[] args) {
        int numThreads = 3;
        for (int i = 0; i < numThreads; i++) {
            new MyThreadRdn(i).start();
        }
        
    }
}
