/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_stencil_latch;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author tuchinski
 */
public class Stencil implements Runnable{
    double[] vet;
    int iteracoes;
    int numTreads;
    
    CountDownLatch sinalPronto;
    CountDownLatch pronto;

    public Stencil(double[] vet, int iteracoes, CountDownLatch feito) {
        this.vet = vet;
        this.iteracoes = iteracoes;
        this.pronto = feito;
        this.sinalPronto = new CountDownLatch(2);
    }

    @Override
    public void run() {
        int count_iteracoes=0;
        
        while(count_iteracoes <=this.iteracoes){
            try {
                
                new Thread(new DivisorLatch(1, vet, sinalPronto)).start();
                new Thread(new DivisorLatch(2, vet, sinalPronto)).start();
                
                sinalPronto.await();
                count_iteracoes++;
                sinalPronto = new CountDownLatch(2);
                
            } catch (InterruptedException e) {
            }
        }
        this.pronto.countDown();
        
    }
    
    
    
    
}
