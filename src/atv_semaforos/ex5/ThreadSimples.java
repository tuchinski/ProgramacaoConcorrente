/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex5;

import java.util.Random;

/**
 *
 * @author tuchinski
 */
public class ThreadSimples extends Thread{
    Barreira b;
    int tempo;

    public ThreadSimples(Barreira b) {
        this.b = b;
    }
    
    public ThreadSimples(Barreira b, int tempo) {
        this.b = b;
        this.tempo = tempo;
    }

    
    @Override
    public void run() {
        //Random rnd = new Random();
        System.out.println("Rodando Thread " + Thread.currentThread().getName());
        try {
//            Thread.sleep(rnd.nextInt(5) * 1000);
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {}
        b.incrementaBarreira();
        System.out.println("Finalizando Thread " + Thread.currentThread().getName());
    }
    
}
