package test.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("zaur");
        arrayList1.add("ivan");
        arrayList1.add("mariya");
        arrayList1.add("kolya");

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[5]);
//
//        for (String s: array2){
//            System.out.println(s);
//        }

//        List<String> myList = arrayList1.subList(0,3);
////        System.out.println(myList);
//        myList.add("JAck");
//        System.out.println(myList);
//        System.out.println(arrayList1);
//

//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("zaur");
//        arrayList2.add("mariya");
//        arrayList2.add("igor");

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);


    }
}
