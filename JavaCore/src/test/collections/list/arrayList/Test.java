package test.collections.list.arrayList;

import java.util.ArrayList;

public class Test  {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Jack");

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Rob");
        arrayList2.add("Nick");

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
        System.out.println(arrayList3);
    }
}
