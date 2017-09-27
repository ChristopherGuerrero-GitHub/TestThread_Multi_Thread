package com.example.java;


public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void runRunnable() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                //Let the thread sleep for awhile
                System.out.println("Thread sleep 50. " + threadName);
                Thread.sleep(50);

            }
        }
        catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");

        }
        System.out.println("Thread " + threadName + " exiting.");

    }

    @Override
    public void startRunnable() {
        System.out.println("Starting thread " + threadName);

        if (t == null){

           t = new Thread(this::runRunnable,threadName);
           t.start();


           //Note the following two lines of code will also work without the use of the
            // of assigning the instant variable t creating an object thread named t.
//            Thread test = new Thread(this::run);
//            test.start();


        }
    }
}
