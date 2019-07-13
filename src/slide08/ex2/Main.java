/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide08.ex2;

/**
 *
 * @author tuchinski
 */
public class Main {
    public static void main(String[] args) {
        int numgarfo = 3;
        Garfo g =  new Garfo(numgarfo);
      
        
        
        Thread f1 = new Filosofo(g, 0);
        Thread f2 = new Filosofo(g, 1);
        Thread f3 = new Filosofo(g, 2);
        
        f1.start();
        f2.start();
        f3.start();
        
    }
}
