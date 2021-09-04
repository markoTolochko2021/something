package test.collections.map;

import test.Stream.MapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"Mark");
        map1.put(120,"Bob");
        map1.put(680,"Mar");
        map1.put(690,"Rob");
        map1.put(695,"Nick");
        map1.put(120,"Mark");
        map1.put(null,null);
        map1.putIfAbsent(690, "Mike");
        System.out.println(map1);
        System.out.println(map1.get(695));
        map1.remove(120);
        System.out.println(map1);
        System.out.println(map1.containsValue("Rob"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }
}
