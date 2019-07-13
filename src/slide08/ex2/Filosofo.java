/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide08.ex2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuchinski
 */
public class Filosofo extends Thread {

    Garfo g;
    int id;
    int garfoDir;
    int garfoEsq;
    int tempoPensar;
    int tempoComer;

    public Filosofo(Garfo g, int id) {
        this.g = g;
        this.id = id;
        Random rnd = new Random();
        this.tempoPensar = (rnd.nextInt(5) * 1000);
        this.tempoComer = (rnd.nextInt(5) * 1000);
        this.garfoDir = this.id;
        this.garfoEsq = (this.id + 1) % g.numGarfos;

    }

    public Filosofo(Garfo g, int id, int tempoPensar, int tempoComer) {
        this.g = g;
        this.id = id;
        this.tempoPensar = tempoPensar;
        this.tempoComer = tempoComer;
        this.garfoDir = this.id;
        this.garfoEsq = (this.id + 1) % g.numGarfos;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(this.id + " PENSANDO!!!!");
                Thread.sleep(this.tempoPensar);
                this.g.pegarGarfo(garfoEsq, garfoDir);
                System.out.println(this.id + " COMENDO####");
                Thread.sleep(this.tempoComer);
                System.out.println(this.id + " LIBERANDO&&&&");
                this.g.liberaGarfo(garfoEsq, garfoDir);   
            } catch (InterruptedException ex) {}
            
        }
    }

}
