package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException{
	Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        Thread3 c = new Thread3();
        Thread4 d = new Thread4();
        a.start();
        a.join();
        b.start();
        b.join();
        c.start();
        c.join();
        d.start();
        d.join();
        System.out.println("...Main thread has ended...");
    }
}
