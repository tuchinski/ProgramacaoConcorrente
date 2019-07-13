/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide03.ex1eEx2;

import java.util.Random;

/**
 *
 * @author tuchinski
 */
public class ThreadSimples extends Thread {

    public ThreadSimples(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        Random rnd = new Random();
        while (true) {
            try {
                int tempo = rnd.nextInt(5);
                //System.out.println("Thread " + Thread.currentThread().getName() + "Sleep: " + tempo);
                Thread.sleep(tempo * 1000);
                for (int i = 0; i < 10000000; i++) {
                    for (int j = 0; j < 10000000; j++) {
                        
                    }
                }
                if(Thread.interrupted()){
                    System.out.println("coiso");
                    throw new InterruptedException("deu ruim");
                }
            } catch (InterruptedException ex) {
                System.out.println("interrompeu");
                break;
            }
        }
    }

}
