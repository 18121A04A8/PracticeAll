package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
//        Pair<Integer,String> pair = new Pair<Integer, String>();
//        pair.key=2;
//        pair.value="hiii";
        //pair.setValue("bye");
        Pair pair2 = new Pair();
        pair2.key="5";
//        pair.key="string";
//        System.out.println(pair.getKey()+ " " +pair.getValue());
       // System.out.println(pair2.getKey()+ " " +pair2.getValue());
        int a=99;
        int b=9;
        System.out.println(pair2.fun(a,b));

        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals());
        animals.add(new Dogs());

        List<Dogs> dogs = new ArrayList<>();
        dogs.add(new Dogs());

        List<Cats> cats = new ArrayList<>();
        cats.add(new Cats());

        Animals animals1 = new Animals();
        animals1.get(dogs);

        Animals.funn(cats);


    }
}
