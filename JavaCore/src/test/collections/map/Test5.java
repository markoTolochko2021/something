package test.collections.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Test5 {
    public static void main(String[] args) {

        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Mark", "Tolochko", 4);
        Student st2 = new Student("Nick", "Koko", 1);
        Student st3 = new Student("Jack", "Bobo", 3);
        Student st4 = new Student("Mike", "Nono", 2);

        ht.put(6.4, st2);
        ht.put(7.2, st3);
        ht.put(7.5, st4);
        ht.put(5.8, st1);

        System.out.println(ht);


    }
}
