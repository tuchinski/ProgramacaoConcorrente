/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.ex2;

import java.util.concurrent.Callable;

/**
 *
 * @author a1792334
 */
public class FatorialCallableTask implements Callable<Integer>{
    private final int num;

    public FatorialCallableTask(int valor) {
        this.num = valor;
    }
    
    @Override
    public Integer call(){
        Integer result = 1;
        for(int i=this.num; i>1; i--){
            result = result*i;
        }
        return result;
    }
}
