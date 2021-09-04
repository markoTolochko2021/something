package test.collections.list.arrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(22);
        arrayList.add(0,11);
        arrayList.add(33);
        for (Integer i: arrayList){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(arrayList.get(1));
        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + ", ");
        }
        System.out.println();
        arrayList.set(0, 111);
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
