/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex2;

/**
 *
 * @author tuchinski
 */
public class Main {

    public static void main(String[] args) {
        Thread t1 = new ThreadWait(1000);
        Thread t2 = new ThreadWait(2000);
        t1.setName("a");
        t2.setName("b");
        
        t1.start();
        t2.start();
        
        try {
            t2.join();
        } catch (InterruptedException ex) {System.out.println(ex);}
        
    }

}
