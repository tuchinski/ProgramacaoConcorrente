    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author a1792334
 */

//int[] vetor = new int[10];
public class EncontraMaiorVetor{
    private final int numTarefas;
    private final int numThreads;
    int vetor[];
    ExecutorService executor;

    public EncontraMaiorVetor(int numTarefas, int numThreads, int vetor[]) {
        this.numTarefas = numTarefas;
        this.numThreads = numThreads;
        this.vetor = vetor;
        this.executor = Executors.newFixedThreadPool(this.numThreads);
    }
    
    public void divideVetor(){
        if(this.numTarefas>vetor.length){
            System.out.println("NUMERO DE TAREFAS MAIOR QUE O TAMANHO DO VETOR");
            return;
        }
        
        int numElementos = this.vetor.length/this.numTarefas;
        
        int posI = 0;
        int posF = 0;
        int i;
        for(i=0;i<this.numTarefas-1;i++){
            System.out.println((i+1) +": (" + posI +"," + (posI+numElementos-1) +  ")");
            posI = posI + numElementos;
            //posF = posF + ((this.vetor.length/this.numTarefas));
        }
        
        System.out.println((i+1) + ": (" + posI +"," + (this.vetor.length-1) +  ")");
    }
}
