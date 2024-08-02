package ProducerConsumerSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args){

        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);

        Semaphore producerSema = new Semaphore(5);
        Semaphore consumerSema = new Semaphore(0);

        for(int i=0; i<10; ++i){
            ex.submit(new Producer(store, producerSema, consumerSema));
        }

        for (int i=0; i<20; ++i){
            ex.submit(new Consumer(store, producerSema, consumerSema));
        }


    }
}
