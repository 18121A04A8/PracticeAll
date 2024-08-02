package com.mahendra;

public class CreateThread implements  Runnable{

    public synchronized void run(){
        System.out.println("From thread class");
        System.out.println("from thread - "+ java.lang.Thread.currentThread().getName());
    }
}
