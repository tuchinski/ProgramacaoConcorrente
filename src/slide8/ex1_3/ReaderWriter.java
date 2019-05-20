/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide8.ex1_3;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class ReaderWriter {
    private int numReaders;
    private final Semaphore wLock;
    private final Semaphore mutex;
    private final Semaphore readerWaiting;
    private boolean readerWaitingBool = false;

    public ReaderWriter() {
        this.numReaders = 0;
        this.wLock = new Semaphore(1);
        this.mutex = new Semaphore(1);
        this.readerWaiting = new Semaphore(1);
    }
    
    public void startRead(){
        try {
            this.mutex.acquire();
            
            this.readerWaiting.acquire();
            
            if(numReaders == 0){
                this.wLock.acquire();
            }
            this.numReaders++;
            
            this.readerWaiting.release();
            this.mutex.release();
            
            
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void endRead(){
        try {
            this.mutex.acquire();
            this.numReaders--;
            if(this.numReaders == 0){
                this.wLock.release();
            }
            this.mutex.release();
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
        
    }
    
    
    public void startWrite(){
        try {
            System.out.println("Start read");
            this.mutex.acquire();
            
            this.readerWaiting.acquire();
            this.wLock.acquire();
            
            this.mutex.release();
            System.out.println("end Start read");
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public void endWrite(){
        try {
            System.out.println("end Read");
            this.mutex.acquire();
            
            this.readerWaiting.release();
            this.wLock.release();
            
            this.mutex.release();
            System.out.println("END end Read");
        } catch (InterruptedException ex) {
            Logger.getLogger(ReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
