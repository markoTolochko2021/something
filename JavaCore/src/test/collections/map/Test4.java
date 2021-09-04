package test.collections.map;

import java.util.LinkedHashMap;

public class Test4 {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16, 0.75F, true);
        Student st1 = new Student("Mark", "Tolochko", 4);
        Student st2 = new Student("Nick", "Koko", 1);
        Student st3 = new Student("Jack", "Bobo", 3);
        Student st4 = new Student("Mike", "Nono", 2);

        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
        lhm.put(5.8, st1);

        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(7.5));

        System.out.println(lhm);




        System.out.println(5.8);
        System.out.println(7.5);

    }
}
