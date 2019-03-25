/*
 * Implemente o exemplo de c ́odigo que gera a condi ̧c ̃ao de
 * disputa e tente gerar um teste para que ocorra um problema
 * de seguran ̧ca (safety).
 */
package Ativ1;

class Contador{
    private int valor;
    
    public Contador(int valor){
       this.valor = valor;
    }
    
    public void increments(){
        this.valor = this.valor++;
    }
}

class InsereThread extends Thread{
    Contador contador;
    
    public InsereThread(Contador c){
        this.contador = c;
    }
}

/**
 *
 * @author a1792334
 */
public class Ex3 {
    public static void main(String[] args) {
        
    }
}
