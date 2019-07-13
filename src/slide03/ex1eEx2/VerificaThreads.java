/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide03.ex1eEx2;

/**
 *
 * @author tuchinski
 */
public class VerificaThreads extends Thread {

    ThreadGroup tg;

    public VerificaThreads(ThreadGroup tg) {
        this.tg = tg;
    }

    void verificaThread() {
        Thread[] listaThreads = new Thread[tg.activeCount()];
        
        tg.enumerate(listaThreads);
        System.out.println("Threads Ativas: " + tg.activeCount());

        for (Thread thread : listaThreads) {
            System.out.println("Nome Thread: " + thread.getName());
            System.out.println("ID Thread: " + thread.getId());
            System.out.println("Status Thread: " + thread.getState());
            System.out.print("\n");
        }
    }

    @Override
    public void run() {
        while (true) {
            System.out.print("------------------------------");
            verificaThread();
            System.out.print("------------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }

}
