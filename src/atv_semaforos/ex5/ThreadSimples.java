/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex5;

/**
 *
 * @author tuchinski
 */
public class ThreadSimples extends Thread{

    @Override
    public void run() {
        System.out.println("Rodando Thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("Finalizando Thread " + Thread.currentThread().getName());
    }
    
}
