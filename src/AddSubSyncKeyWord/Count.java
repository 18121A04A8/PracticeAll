package AddSubSyncKeyWord;

public class Count {
    public int value=0;

    public synchronized void add(int x){
        value+=x;
    }

    public synchronized void subtractor(int x){
        value-=x;
    }

}
