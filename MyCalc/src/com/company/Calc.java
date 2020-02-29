package com.company;

import java.util.Scanner;

class Calc {
    public static final void main(String[] args) {
        Integer a;
        Integer b;
        Character op;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
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

