package test.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);

//        int result = list.stream().reduce((acc, el) -> acc*el).get();
//        System.out.println(result);
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> optional = list100.stream().reduce((acc, el) -> acc*el);
        if (optional.isPresent()){
            System.out.println(optional.get());
        }
        else {
            System.out.println("Not present");
        }


    }
}
