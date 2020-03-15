package com.company;

public class Factorial {
    public void calculateFactorial(long result, long i) {
            if (i>=1) {
                result = result * i;
                System.out.println(result);
                this.calculateFactorial(result, i-1);
            }
            //else System.out.println(result);
    }
}
