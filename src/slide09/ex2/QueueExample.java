/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide09.ex2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author a1792334
 */
class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        System.out.println(q.element());
        
        q.remove();
        
        System.out.println(q.size());
    }
}
