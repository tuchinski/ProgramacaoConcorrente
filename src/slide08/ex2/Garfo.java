/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide08.ex2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuchinski
 */
public class Garfo {

    int[] garfos;
    public int numGarfos;
    Semaphore mutex;

    public Garfo(int numGarfos) {
        this.numGarfos = numGarfos;
        garfos = new int[numGarfos];
        mutex = new Semaphore(1);
        for (int g : garfos) {
            g = 0; //false = o garfo não está sendo usado
        }
    }

    void pegarGarfo(int g1, int g2) throws InterruptedException {

        synchronized (this) {
            while (garfos[g1] == 1 || garfos[g2] == 1) {
                this.wait();
            }
            garfos[g1] = 1;
            garfos[g2] = 1;
        }

    }

    void  liberaGarfo(int g1, int g2) {
        
        synchronized(this){
            garfos[g1] = 0;
            garfos[g2] = 0;
            this.notifyAll();
        }
        
    }

}
