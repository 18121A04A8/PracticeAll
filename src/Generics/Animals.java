package Generics;

import java.util.List;

public class Animals {

    public void get(List<? extends Animals> animal){
        System.out.println("HIIIIII");
    }

    public static <T extends Animals> void funn(List<T> animal){
        System.out.println("BYEEEE");
    }
}
