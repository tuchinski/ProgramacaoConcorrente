/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide11.ex2;

import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author a1792334
 */
public class Main {
    public static void main(String[] args) {
        Carta a = new Carta(1, 'A', "copas");
        Carta b = new Carta(1, 'A', "copas");
        
        System.out.println(a);
        System.out.println(b);
        
        PriorityBlockingQueue filaPrioridade = new PriorityBlockingQueue();
        
        System.out.println(a == b);
    }
}
