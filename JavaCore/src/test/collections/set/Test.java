package test.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Mark");
        set.add("Bob");
        set.add("Jack");
        set.add("Rob");

        System.out.println(set);
        for (String s: set){
            System.out.println(s);
        }


    }
}
