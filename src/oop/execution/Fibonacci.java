package oop.execution;

import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger fib2(int n) {

        BigInteger oldest = BigInteger.valueOf(0);
        BigInteger old = BigInteger.valueOf(0);
        BigInteger now = BigInteger.valueOf(1);

        if (n < 0) {
            throw new IllegalArgumentException("Argument zu klein");
        }

        for (int i = 1; i < n; i++) {

            oldest = old;

            old = now;

            now = old.add(oldest);

        }

        //if (now < 0) {
        //    throw new IllegalArgumentException("Argument zu groß");
        //}

        return now;

    }

    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument zu klein");
        }
        if (n <= 1) {
            return n;
        }

        long fib1 = fib(n - 1);
        long fib2 = fib(n - 2);
        long fibx = fib1 + fib2;
        if (fibx < 0) {
            throw new IllegalArgumentException("Argument zu groß");
        } else {
            return fib1 + fib2;
        }
    }

        public static void main(String[] args){
            for (int i = 0; true; i++) {
                System.out.println("fib2(" + i + ") = " + fib2(i));
            }
        }
    }