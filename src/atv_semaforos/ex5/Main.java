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
public class Main {

    public static void main(String[] args) {
        
        Barreira b = new Barreira(1);
        
        Thread t1 = new ThreadSimples(b,1000);
        Thread t2 = new ThreadSimples(b,1000);
        t1.setName("t1");
        t2.setName("t2");
        
        t1.start();
        t2.start();
        
    }

}
