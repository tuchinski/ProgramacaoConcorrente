/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex5;

import java.util.ArrayList;

/**
 *
 * @author tuchinski
 */
public class Barreira {
    private ArrayList<Thread> lista;
    private int valorBarreira;

    public Barreira(int valorBarreira) {
        this.valorBarreira = valorBarreira;
        this.lista = new ArrayList<>(this.valorBarreira);
    }
    
    public synchronized void bloqueia(Thread t){
        try {
            t.wait();
            this.valorBarreira--;
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        if(valorBarreira == 0){
            notifyAll();
        }
    }
    
}
