/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide9.ex2;

/**
 *
 * @author tuchinski
 */
public class ThreadConsome extends Thread {

    private SharedFifoQueue fila;

    public ThreadConsome(SharedFifoQueue fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while (true) {
            int valor = 0;
            try {
                valor = this.fila.remove();
            } catch (InterruptedException ex) {
            }
            System.out.println("Valor Removido: " + valor);
        }
    }

}
