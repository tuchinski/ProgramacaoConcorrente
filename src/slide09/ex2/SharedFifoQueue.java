/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide09.ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author a1792334
 */
public class SharedFifoQueue {

    private final Queue<Integer> fila;
    private final int tamanhoMax;
    private final ReentrantLock lock;
    private final Condition estaCheio;
    private final Condition estaVazio;

    public SharedFifoQueue(ReentrantLock l, int tam) {
        this.tamanhoMax = tam;
        this.fila = new LinkedList<>();
        this.lock = l;
        this.estaCheio = this.lock.newCondition();
        this.estaVazio = this.lock.newCondition();

    }

    public void insere(int num) throws InterruptedException {
        lock.lock();
        try {
            while (this.fila.size() == this.tamanhoMax) {
                System.out.println("Esperando tirar itens!!");
                estaCheio.await();
            }
            this.fila.add(num);
            this.estaVazio.signal();
        } finally {
            this.lock.unlock();
        }
    }

    public int remove() throws InterruptedException {
        lock.lock();
        try {
            while (this.fila.isEmpty()) {
                System.out.println("Esperando colocar Itens!!");
                this.estaVazio.await();
            }
            int valorRemovido = this.fila.remove();
            this.estaCheio.signal();
            return valorRemovido;
        } finally {
            this.lock.unlock();
        }
    }

}
