/*
Faça uma Thread que monitora um conjunto de threads e
exiba quais threads receberam sinais de interrupção.
 */
package Ativ2;

import java.util.ArrayList;

/**
 *
 * @author tuchinski
 */
class MonitorThread implements Runnable {

    ArrayList<Thread> threads;

    public MonitorThread(ArrayList listThreads) {
        this.threads = listThreads;
    }

    @Override
    public void run() {
        while (true && this.threads.size() > 0) {
            int i = 0;
            for (Thread t : this.threads) {
                if (t.isInterrupted()) {
                    System.out.println("ponto");
                    System.out.println("Thread " + i + "is interrupted\n");
                }else{
                    System.out.println("Thread " + i + "is  not interrupted\n");
                }
                i++;
            }
        }
    }

}

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Thread> listThreads= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listThreads.add(new MyThreadRdn(i));
            listThreads.get(i).start();
        }
        new Thread(new MonitorThread(listThreads)).start();
        
        
        listThreads.get(0).interrupt();
        listThreads.get(1).interrupt();
        listThreads.get(2).interrupt();
        listThreads.get(3).interrupt();
    }
}
