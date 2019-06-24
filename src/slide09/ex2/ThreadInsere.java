/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide09.ex2;

import java.util.Random;

/**
 *
 * @author cogeti
 */
public class ThreadInsere extends Thread{
    private SharedFifoQueue fila;

    public ThreadInsere(SharedFifoQueue fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while(true){
            Random rnd = new Random();
            int numAleatorio = rnd.nextInt(100);
            try {
                this.fila.insere(numAleatorio);
                System.out.println("Inserindo Número -> " + numAleatorio);
            } catch (InterruptedException ex) {}
        }
    }
        
}
