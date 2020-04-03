package com.company;

public class Supplier implements Runnable {//поставщик
    @Override
    public void run() {

       System.out.println("supl");
       /* Consum a = new Consum();

       try {
            wait();
        } catch (InterruptedException e) {
           System.out.println(a);
        }
        notify();*/
    }
}
