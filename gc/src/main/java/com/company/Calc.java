package com.company;

import java.util.Scanner;

class Calc {
    private double a;
    private double b;
    private Character op;

    public Calc () {
        this.a = 0.0;
        this.b = 0.0;
        this.op = ' ';
    }
    public static final void Calculator() {
        double a;
        double b;
        Character op;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        op = in.next().charAt(0);
        switch(op) {
            case '+':{
                System.out.println(a+b);
            }
            break;
            case '-':{
                System.out.println(a-b);
            }
            break;
            case '*':{
                System.out.println(a*b);
            }
            break;
            case '/':{
                System.out.println(a/b);
            }
            break;
            default:{
                System.out.println('0');
            }
        }

    }
}