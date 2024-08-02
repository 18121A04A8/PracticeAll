package Generics;

public class Pair {
    Object key;
    Object value;

//    public void setKey(A key) {
//        this.key = key;
//    }
//
//    public void setValue(B value) {
//        this.value = value;
//    }
//
//    public A getKey() {
//        return key;
//    }
//
//    public B getValue() {
//        return value;
//    }

    public <gen> gen fun(gen a, gen b){
        return a;
    }
}
