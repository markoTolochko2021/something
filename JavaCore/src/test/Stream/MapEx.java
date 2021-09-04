package test.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How are you doing?");
        list.add("Fine!!");
        list.add("Good!");
        list.add("Bye!!");

//        for (int i = 0; i<list.size(); i++){
//            System.out.println(list.get(i));
//            System.out.println(list.get(i).length());
//        }
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);


        int[] array = {5,9,3,0,1,2,8};
        array = Arrays.stream(array).map(element -> {if (element % 3 == 0){
            element = element / 3;
        }
        return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
    }
}
