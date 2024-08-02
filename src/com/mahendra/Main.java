package com.mahendra;
import  java.lang.Thread;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(10);
//        System.out.println(" thread from "+ Thread.currentThread().getName());
//        CreateThread task1 = new CreateThread();
//        Thread  t1 = new Thread(task1);
//        Thread  t2 = new Thread(task1);
//        Thread  t3 = new Thread(task1);
//        Thread  t4 = new Thread(task1);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        //t1.start();
        CreateThread task1 = new CreateThread();
        for(int i=0;i<1000;i++){
            ex.submit(task1);
        }
    }
}
