package test.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How are yoy?");
        list.add("Bye!!");
        list.add("Have a good day!!");
//        list.removeIf(element -> element.length() < 6);
        Predicate<String> p = element -> element.length() < 6;
        list.removeIf(p);
        System.out.println(list);
    }
}
