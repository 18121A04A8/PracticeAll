package MergeSortUsingThreads;

import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newCachedThreadPool();
        Semaphore sema = new Semaphore(10);
        sema.acquire();
        sema.release();

        List<Integer>  list = List.of(2,3,4,5,644,55,4,5,6,3,4,5,5);

        Sorter t = new Sorter(list,ex);
        Future<List<Integer>> ans = ex.submit(t);
        list=ans.get();
        System.out.println(list);
    }
}
