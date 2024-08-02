package ProducerConsumerSemaphores;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    Store store;
    Semaphore producerSema;
    Semaphore consumerSema;
    public Producer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.consumerSema = consumerSema;
        this.producerSema = producerSema;
    }

    @Override
    public void run(){
        while (true) {
            try {
                producerSema.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.addProduct();
            consumerSema.release();



        }
    }
}
