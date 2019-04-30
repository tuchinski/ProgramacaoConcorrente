/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex3;

/**
 *
 * @author a1792334
 */
public class Counter {
    private int valor = 0;
    
    public synchronized int increments(){
        return this.valor++;
    }
}
