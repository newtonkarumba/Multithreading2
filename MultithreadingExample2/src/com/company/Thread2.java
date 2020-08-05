package com.company;

public class Thread2 extends Thread1{
    @Override
    public void run() {
        for (int i=0; i<=5;i++)
        System.out.println("Thread2 has started...");
        new Thread3().start();
    }
}
