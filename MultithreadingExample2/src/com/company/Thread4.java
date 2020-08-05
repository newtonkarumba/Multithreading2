package com.company;

public class Thread4 extends Thread3 {
    @Override
    public void run() {
        for (int i=0; i<=5;i++)   { System.out.println("...Thread 4 is starting...");}

        System.out.println("...Thread 4 has ended...");
    }

}
