/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.ex1;

import slide10.ex2.ResultadoClass;

/**
 *
 * @author a1792334
 */
public class FatorialRunnableTask implements Runnable{
    private final int num;
    private ResultadoClass resultado;

    public FatorialRunnableTask(int num, ResultadoClass resultado) {
        this.num = num;
        this.resultado = resultado;
    }
    
        
    
    @Override
    public void run(){
        int result = 1;
        for(int i=this.num; i>1; i--){
            result = result*i;
        }
        
        this.resultado.setValor(result);
        //System.out.println("Resultado: " + result);
    }
}
