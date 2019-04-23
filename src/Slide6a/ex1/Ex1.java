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
class MonitorBufferCircular{
    private final int n = 10;
    private int vet[] = new int[n];
    private int inicio, fim = 0;
    private boolean vazio = true;
    
    public synchronized void insere(int valor) {
        while((this.inicio == this.fim) && this.vazio == false ){
            try {
                this.wait();
            } catch (InterruptedException ex) {}
        }
        vet[fim] = valor;
        this.fim = ((this.fim+1)%this.n);
        this.notifyAll();
        
    }
    
    public synchronized int consome(){
        while(this.vazio == true){
            try {
                this.wait();
            } catch (InterruptedException ex) {}
        }
        int valor = vet[this.inicio];
        this.inicio = ((this.inicio+1)%this.n);
        if(this.fim == this.inicio){
            this.vazio = true;
        }
        return vet[valor];
    }
}
    
    


public class Ex1 {
    public static void main(String[] args) {
        
    }
}
