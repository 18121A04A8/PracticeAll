package AddSubSyncKeyWord;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    Count count;
    public Adder(Count count){
        this.count = count;
    }

    public Void call(){
        for(int i=0; i<10000;i++){
            //synchronized (count) {
                count.add(count.value);
           // }

        }
        return null;
    }
}
