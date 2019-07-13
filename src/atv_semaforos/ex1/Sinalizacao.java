/*1. Sinalização
Enviar sinal para outra thread para indicar que um evento ocorreu.
Faça um código que uma thread t1 e t2 são inicializadas simultaneamente, mas a t2 pode somente
continuar a execução após a sinalização de t1.*/
package atv_semaforos.ex1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author a1792334
 */
public class Sinalizacao {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(0);
        
        Thread t1 = new SimpleThread(5000,s,"t1");
        new Thread(new SimpleThreadRunnable(s)).start();
        t1.start();      
    }
}
