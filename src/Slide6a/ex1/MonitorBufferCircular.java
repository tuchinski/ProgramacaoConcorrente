/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide6a.ex1;

/**
 *
 * @author a1792334
 */
class MonitorBufferCircular {

    private final int n = 10;
    private int size = 0;
    private final int vet[];
    private int inicio = 0;
    private int fim = 0;

    MonitorBufferCircular() {
        this.vet = new int[n];
    }
    
    public synchronized void insere(int valor) {
        while (this.size == this.n) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println("interrupção insere " + ex);
            }
        }
        
        this.vet[this.fim] = valor;
        this.fim = ((this.fim + 1) % this.n);
        this.size++;
        this.notifyAll();

    }

    public synchronized int consome() {
        while (this.size == 0) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println("interrupção consome");
            }
        }
        int valor = vet[this.inicio];        
        this.inicio = ((this.inicio + 1) % this.n);
        this.size--;
        this.notifyAll();
        return valor;
    }
}
