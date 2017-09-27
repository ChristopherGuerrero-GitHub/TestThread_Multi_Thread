package com.example.java;

public class Main  {

    public static void main(String[] args) {

        /*
            This program runs multithreads with a class RunnableDemo that implements a interface Runnable.
            The interface Runnable contains method signatures with no body and the implementation class
            RunnableDemo has the same method signatures along with body. In this program only two threads are
            created R1 and R2. Each thread will start a thread in the startRunnable method and invoke a runRunnable
            method where there is a count down loop from four to zero with a Thread sleep method per each iteration.
         */
        RunnableDemo R1 = new RunnableDemo("Thread - 1");
        R1.startRunnable();


        RunnableDemo R2 = new RunnableDemo("Thread - 2");
        R2.startRunnable();


    }
}
