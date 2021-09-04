package test.generics;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Hello");
        arrayList2.add("Ok");
        arrayList2.add("Bye");
        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(s);

    }
}
class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
