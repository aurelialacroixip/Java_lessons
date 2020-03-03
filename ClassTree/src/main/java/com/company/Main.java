package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code ]

        Character ch; //for choosing: stud or teach

        Integer ag;
        String nam;
        Character s;
        String gr;
        Float exp;

        System.out.println("Enter 0 to enter data for student or Enter 1 for teacher");

        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);

        switch (ch) {
            case '0':{
                System.out.println("Enter age of stud");
                ag = in.nextInt();
                System.out.println("Enter name of stud");
                nam = in.next();
                System.out.println("Enter sex of stud");
                s = in.next().charAt(0);
                System.out.println("Enter group");
                gr = in.next();

                Stud st = new Stud(ag, nam, s, gr);
                st.printall();
            }
            break;
            case '1':{
                System.out.println("Enter age of teach");
                ag = in.nextInt();
                System.out.println("Enter name of teach");
                nam = in.next();
                System.out.println("Enter sex of teach");
                s = in.next().charAt(0);
                System.out.println("Enter experience");
                exp = in.nextFloat();

                Teach te = new Teach(ag, nam, s, exp);
                te.printall();
            }
            break;
        }

        /*ag = in.nextInt();
        nam = in.next();
        s = in.next().charAt(0);
        gr = in.next();
        exp = in.nextFloat();*/




    }
}
