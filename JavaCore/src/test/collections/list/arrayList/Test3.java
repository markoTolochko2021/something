package test.collections.list.arrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("zaur");
        arrayList1.add("ivan");
        arrayList1.add("mariya");
//        System.out.println(arrayList1);
//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("JACK");
//
//        arrayList1.addAll(arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();

        System.out.println(arrayList1.indexOf("ivan"));
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("zaur"));

    }
}
