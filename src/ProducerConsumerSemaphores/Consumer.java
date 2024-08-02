package ProducerConsumerSemaphores;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Store store;
    Semaphore producerSema;
    Semaphore consumerSema;
    public Consumer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.consumerSema = consumerSema;
        this.producerSema = producerSema;
    }
    @Override
    public void run(){
        while (true) {
            try {
                consumerSema.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.removeProduct();
            producerSema.release();

        }
    }
}
