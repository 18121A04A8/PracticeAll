package Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {

    static Lock lock = new ReentrantLock();
    private static DBConnection instance =null;
    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(instance == null){
            lock.lock();
            //synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
                lock.unlock();
            //}

        }
        return instance;
    }
}
