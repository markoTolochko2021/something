package test.collections.set;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(2);
        hashSet1.add(1);
        hashSet1.add(3);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(11);
        hashSet2.add(10);
        hashSet2.add(2);
        hashSet2.add(1);
        hashSet2.add(3);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);




    }
}
