/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide8.ex1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class ReaderWriter {
    int numReaders = 0;
    Semaphore mutex = new Semaphore(1);
    Semaphore wLock = new Semaphore(1);
    
    public synchronized void startRead(){
        if(this.numReaders == 0){
            try {
                this.wLock.acquire();
            } catch (InterruptedException ex) {
                this.numReaders++;
            }
        }
        this.numReaders++;
    }
    
    public synchronized void endRead(){
        this.numReaders--;
        if(this.numReaders == 0){
            this.wLock.release();
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
