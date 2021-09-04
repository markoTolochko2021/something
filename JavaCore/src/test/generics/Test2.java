package test.generics;

public class Test2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 20);
        System.out.println("value1 " + pair.getFirstValue1() + " value2 " + pair.getSecondValue1());
        Pair<Double, Integer> pair1 = new Pair<>(3.14, 20);
        System.out.println("value1 " + pair.getFirstValue1() + " value2 " + pair.getSecondValue1());


    }
}
class Pair <V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue1() {
        return value1;
    }
    public V2 getSecondValue1() {
        return value2;
    }
}
