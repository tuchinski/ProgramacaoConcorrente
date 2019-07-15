/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide11.ex1ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author a1792334
 */
public class Main {
    public static void main(String[] args) {
        BlockingQueue fila = new ArrayBlockingQueue(100);
        
        Produtor p1 = new Produtor(fila);
        Produtor p2 = new Produtor(fila);
        Produtor p3 = new Produtor(fila);
        Consumidor c1 = new Consumidor(fila);
        Consumidor c2 = new Consumidor(fila);
        Consumidor c3 = new Consumidor(fila);
        
        
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        
    }
}
