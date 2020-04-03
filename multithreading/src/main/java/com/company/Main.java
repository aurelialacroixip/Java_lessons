package com.company;


public class Main {


    public static void main(String[] args) {
        Thread t = new Thread(new Supplier());
        Thread t1 = new Thread(new Consum());

        t1.start();

        t.start(); //создает и отделяет поток
        //synchronized (Consum.total);

        //t.run(); //выполняет метод потока
    }
}
