package test.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test6 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("zaur");
        arrayList1.add("ivan");
        arrayList1.add("mariya");
        arrayList1.add("kolya");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
