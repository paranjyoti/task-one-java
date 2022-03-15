package com.JavaBeginnersProblems;

//Date: March 14, 2022
//Purpose: Implement basic OOP, Methods, Exception Handling, Thread

public class TaskOne {
    int x = 502;
    int y = 52;
    String firstName = "John";
    String lastName = "Doe";
    public static void main(String[] args) {
        TaskOne toObj1 = new TaskOne();
        System.out.println(toObj1.x);

        TaskOne toObj2 = new TaskOne();
        System.out.println(toObj2.x);

        int A = 12;
        int B = 24;
        int gcd = findGCD(12,24);
        System.out.println("GCD of " + A + " and " + B + ": " + gcd);

        try {
            System.out.println(toObj2.divide(56, 0));
        } catch ( Exception e ) {
            System.out.println("Error::" + e.getMessage());
        }
    }

    public boolean isPrime(int N) {
        if ( N == 1 ) {
            return false;
        }

        for ( int i = 2; i * i < N; i++ ) {
            if ( N % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    static int findGCD(int A, int B) {
        while ( A > 0 ) {
            int A_ = B % A;
            int B_ = A;
            A = A_;
            B = B_;
        }
        return B;
    }

    public int divide(int A, int B) {
        return A / B;
    }
}
