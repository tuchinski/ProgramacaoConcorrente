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
public class ProcuraVetorThread {
    int valor;
    int[] vetor;
    int numThreads;

    public ProcuraVetorThread(int valor, int[] vetor, int numThreads) {
        this.valor = valor;
        this.vetor = vetor;
        this.numThreads = numThreads;
    }
    
    void inicBusca(){
        int min = 0;
        int salto = (vetor.length/numThreads);
        int max = salto;
        
        for(int i=0;i<numThreads;i++){
            new Thread(new BuscaThread(vetor, min, max, valor)).start();
            min = max +1;
            max = min + salto;
            if(max == vetor.length){
                max = max-1;
            }
//            System.out.println("aaaaa");
        }
        
    }
}
