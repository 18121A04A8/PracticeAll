package ProducerConsumerSemaphores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;
    //private List<Object> items;
    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items= new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public  void addProduct(){
        System.out.println(" Producer is producing new item, current size is : "+ items.size());
        this.items.add(new Object());
    }

    public  void removeProduct() {
        System.out.println(" Counsumer is consuming, current size is : "+this.items.size());
        this.items.remove();
    }
}
