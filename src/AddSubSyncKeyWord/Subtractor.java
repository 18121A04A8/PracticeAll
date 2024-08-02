package AddSubSyncKeyWord;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    Count count;
    public Subtractor(Count count){
        this.count = count;
    }

    public Void call(){
        for(int i=0; i<10000;i++){
            //synchronized (count) {
            count.subtractor(count.value);
            //}
        }
        return null;
    }
}
