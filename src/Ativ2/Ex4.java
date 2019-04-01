/*
Faça uma Thread que monitora um conjunto de threads e
exiba quais threads receberam sinais de interrupção.
 */
package Ativ2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            for (Thread t : threads) {
                if (t.isInterrupted()) {
                    System.out.println("Thread " + t.currentThread().getName() + " interrupted");
                } else {
                    System.out.println("Thread " + t.currentThread().getName() + " running");
                }

//                System.out.println(t.getState());
            }

            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Thread Monitor Interrupted");
        }

    }
}

class SimpleThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
//                System.out.println("Thread " + Thread.currentThread().getName()+ " is running!");
                Thread.sleep(3000);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

}

public class Ex4 {

    public static void main(String[] args) {
        ArrayList<Thread> arrayThreads = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Thread t1 = new SimpleThread();
            t1.setName(Integer.toString(i));
            arrayThreads.add(t1);
            arrayThreads.get(i).start();
        }
        
        System.out.println(arrayThreads.size());
        
        Thread monitor = new Thread(new MonitorThread(arrayThreads));
        monitor.start();

    }
}

//        Runnable sleep = () ->{
//            try {
//                Thread.sleep(2000);
//                t1.interrupt();
//            } catch (InterruptedException ex) {
//                
//            }
//        };
