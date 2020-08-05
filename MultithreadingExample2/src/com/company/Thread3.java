package com.company;

public class Thread3 extends Thread2 {
    @Override
    public void run() {
        for (int i=0; i<=5;i++)

        System.out.println("...Thread 3 is starting...");
        new Thread4().start();
    }
}
