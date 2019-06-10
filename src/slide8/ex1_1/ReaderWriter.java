/**
 *  Implementar soluções para o problema dos leitores-escritores
 * que:
 * 1.1  priorize os leitores.
 * 1.2  sem inani ̧c ̃ao.
 * 1.3  priorize os escritores.
 */
package slide8.ex1_1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class ReaderWriter {
    private int numReaders = 0;
    private final Semaphore mutex = new Semaphore(1);
    private final Semaphore wLock = new Semaphore(1);
    
    public void startRead(){
        try {
            this.mutex.acquire();
            if(this.numReaders == 0){
                this.wLock.acquire();
            }
            this.numReaders++;
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void endRead(){
        try {
            this.mutex.acquire();
            if(this.numReaders == 1){
                this.wLock.release();
            }
            this.numReaders--;
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void startWrite(){
        try {
            this.wLock.acquire();
        } catch (InterruptedException ex) {
            System.out.println("IE: " + ex.getMessage());
        }
    }
    
    public void endWrite(){
        this.wLock.release();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public int read() {
        int value = 0;
        try {
            if (this.numReaders == 0) {
                try {
                    this.wLock.acquire();
                    this.numReaders++;
                } catch (InterruptedException ex) {
                    System.out.println("IE: " + ex.getMessage());
                }
            }else{
                this.numReaders++;
            }

            this.mutex.acquire();
            

        } catch (InterruptedException ex) {
            System.out.println("IE: " + ex.getMessage());
        } finally{
            this.mutex.release();
            this.numReaders--;
            if(this.numReaders == 0){
                this.wLock.release();
            }
        }
        return value;
        
    }

}
