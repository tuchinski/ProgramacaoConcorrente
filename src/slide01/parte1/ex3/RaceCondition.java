/*
 * Implemente o exemplo de c ́odigo que gera a condição de
 * disputa e tente gerar um teste para que ocorra um problema
 * de seguran ̧ca (safety).
 */
package slide01.parte1.ex3;



class InsereThread extends Thread{
    private int countSequence = 0;
    
    public InsereThread(){
    }
    
    public int nextValueSequence(){
        this.countSequence++;
        return this.countSequence;
    }
}

class UnsafeThread extends Thread{
    private InsereThread insereThread;
    
    public UnsafeThread(){
        this.insereThread = new InsereThread();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
           int value = this.insereThread.nextValueSequence();
            System.out.println(value);
        }
    }
}

/**
 *
 * @author a1792334
 */
public class RaceCondition {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new UnsafeThread().start();
        }
        
    }
}
