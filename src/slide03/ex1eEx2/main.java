/*1. Faça um programa em Java que consulte periodicamente o
estado de um conjunto de threads.
2. Faça um programa em Java para testar um conjunto de
opera¸c˜oes sobre um grupo de threads. Use o ThreadGroup.*/

package slide03.ex1eEx2;

/**
 *
 * @author tuchinski
 */
public class main {

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("grupo");

        Thread t1 = new ThreadSimples(tg, "t1");
        Thread t2 = new ThreadSimples(tg, "t2");
        Thread t3 = new ThreadSimples(tg, "t3");
        Thread t4 = new ThreadSimples(tg, "t4");
//        
        t1.start();
        t2.start();
//        t3.start();
//        t4.start();

        VerificaThreads vt = new VerificaThreads(tg);

        vt.start();

        Runnable task = () -> {
            try {
                Thread.sleep(6000);
                tg.interrupt();
                System.out.println("aaaaa");
                System.out.println(t1.isInterrupted());
            } catch (InterruptedException ex) {
                
            }

        };

        new Thread(task).start();
    }
}
