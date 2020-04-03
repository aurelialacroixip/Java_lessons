package com.company;

import java.util.Random;

public class Consum implements Runnable {
    @Override
    public void run() {
        /*Integer i;
        Random rnd = new Random((System.currentTimeMillis()));
        i = rnd.nextInt(100);
        System.out.println("I want buy " + i + " products");*/
        synchronized (this) {
            Integer i;
            for (i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            notify();
        }
            //notify();
    }
}
