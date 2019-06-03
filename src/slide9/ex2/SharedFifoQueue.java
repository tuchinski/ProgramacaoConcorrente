/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide9.ex2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author a1792334
 */
public class SharedFifoQueue {
    private int fila[];
    private final int tamanho; 
    private int qtde;
    final ReentrantLock lock;
    final Condition estaCheio; 
    final Condition estaVazio;
    
    public SharedFifoQueue(ReentrantLock l,int tam) {
        this.qtde = 0;
        this.tamanho = tam;
        this.fila = new int[this.tamanho];
        this.lock = l;
        this.estaCheio = this.lock.newCondition();
        this.estaVazio = this.lock.newCondition();
                
    }
    
    public int insere(int num) throws InterruptedException{
        lock.lock();
        while(this.tamanho == this.qtde){
            estaCheio.await();
        }
        
    }
    
    
}
