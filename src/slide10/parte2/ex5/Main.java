/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tuchinski
 */
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        
//        service.schedule(new ScheduleClass(), 2, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new ScheduleClass(), 5, 2, TimeUnit.SECONDS);
    }
}
