package com.JavaBeginnersProblems;

//Date: March 14, 2022
//Purpose: Implement basic OOP, Methods, Exception Handling, Thread

public class TaskOneSecondClass implements Runnable {
    public static void main(String[] args) {
        TaskOne toObj = new TaskOne();
        System.out.println(toObj.x);

        TaskOne toObj2 = new TaskOne();
        toObj2.y = 5002;
        System.out.println(toObj.y);
        System.out.println(toObj2.y);
        System.out.println("Name: " + toObj2.firstName + " " + toObj2.lastName);

        int N = 2;
        if (toObj.isPrime(N)) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }

        TaskOneSecondClass testThreadObject = new TaskOneSecondClass();
        Thread threadObj = new Thread(testThreadObject);
        threadObj.start();
        System.out.println("This code is outside the thread.");
    }

    public void run() {
        System.out.println("This code is running in a thread.");
    }
}
