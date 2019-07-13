/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide03.ex4;

/**
 *
 * @author tuchinski
 */
public class BuscaThread extends Thread {
    int[] vetor;
    int min;
    int max;
    int valor;

    public BuscaThread(int[] vetor, int min, int max, int valor) {
        this.vetor = vetor;
        this.min = min;
        this.max = max;
        this.valor = valor;
    }

    @Override
    public void run() {
        for(int i = min;i<max;i++){
            if(vetor[i] == valor){
                System.out.println("O valor " + valor+" foi encontrado pela Thread " + Thread.currentThread().getName());
                Thread.currentThread().interrupt();
            }
        }
    }
    
    
}
