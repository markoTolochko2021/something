package test.Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamEx {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumRes = list.parallelStream().reduce((ac, el) -> ac + el).get();
        System.out.println("sumRes" + sumRes);


    }
}
