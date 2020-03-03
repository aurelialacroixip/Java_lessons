package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code ]
        Integer ag;
        String nam;
        Character s;
        String gr;
        Float exp;

        Scanner in = new Scanner(System.in);
        ag = in.nextInt();
        nam = in.next();
        s = in.next().charAt(0);
        gr = in.next();
        exp = in.nextFloat();

        Stud st = new Stud(ag, nam, s, gr);
        st.printall();

        Teach te = new Teach(ag, nam, s, exp);
        te.printall();
    }
}
