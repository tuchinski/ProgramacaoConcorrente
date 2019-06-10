/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide9.ex3;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author a1792334
 */
public class ArrayListThreadSafe {

    private final ArrayList<Integer> list;
    private final ReentrantReadWriteLock rwl;
    private final ReentrantReadWriteLock.ReadLock r;
    private final ReentrantReadWriteLock.WriteLock w;

    public ArrayListThreadSafe(ArrayList<Integer> list, ReentrantReadWriteLock rwl) {
        this.list = list;
        this.rwl = rwl;
        this.r = rwl.readLock();
        this.w = rwl.writeLock();
    }

    public int read(int index) {
        r.lock();
        try {
            return this.list.get(index);
        } finally {
            r.unlock();
        }
    }

    public void write(int value) {
        w.lock();

        try {
            this.list.add(value);
        } finally {
            w.unlock();
        }
    }

}
