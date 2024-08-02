package MergeSortUsingThreads;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> ArrayToSort;
    ExecutorService ex;
    Sorter(List<Integer> ArrayToSort, ExecutorService ex){
        this.ArrayToSort = ArrayToSort;
        this.ex = ex;
    }

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {

        if(ArrayToSort.size()<=1){
            return ArrayToSort;
        }

        int mid = ArrayToSort.size()/2;

        List<Integer> leftHalf = new ArrayList<>();
        for(int i=0;i<mid;i++){
            leftHalf.add(ArrayToSort.get(i));
        }

        List<Integer> rightHalf = new ArrayList<>();
        for(int i=mid;i<ArrayToSort.size();i++){
            rightHalf.add(ArrayToSort.get(i));
        }

        Sorter task1 = new Sorter(leftHalf, ex);
        Sorter task2 = new Sorter(rightHalf, ex);
        Future<List<Integer>> leftSortedArray = ex.submit(task1);
        Future<List<Integer>> rightSortedArray = ex.submit(task2);
        leftHalf = leftSortedArray.get();
        rightHalf = rightSortedArray.get();

        List<Integer> finalMergedArray = new ArrayList<>();
        int i=0,j=0;
        while (i<leftHalf.size() && j<rightHalf.size()){
            if(leftHalf.get(i)<rightHalf.get(j)){
                finalMergedArray.add(leftHalf.get(i));
                i++;
            }
            else{
                finalMergedArray.add(rightHalf.get(j));
                j++;
            }
        }

        while (i<leftHalf.size()){
            finalMergedArray.add(leftHalf.get(i));
            i++;
        }
        while (j<rightHalf.size()){
            finalMergedArray.add(rightHalf.get(j));
            j++;
        }


        return finalMergedArray;
    }

}
