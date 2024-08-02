package Singleton;

import java.util.concurrent.locks.Lock;

public class Client {
    public static void main(String[] args){

        Lock lock;
        DBConnection a = DBConnection.getInstance();
        DBConnection b = DBConnection.getInstance();

        System.out.println(a);
        System.out.println(b);
    }
}
