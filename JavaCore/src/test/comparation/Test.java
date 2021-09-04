package test.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mark");
        list.add("Bob");
        list.add("Jack");
        System.out.print(list);
        Collections.sort(list);
        System.out.println();
        System.out.print(list);
    }
}
