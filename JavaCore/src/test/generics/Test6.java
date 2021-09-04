package test.generics;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<? > list = new ArrayList<>();




        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(5.14);
        listDouble.add(7.14);
        System.out.println();
        System.out.println(summ(listDouble));



    }
    static void showList(List<?> list){
        System.out.println("list elements:   " + list);
    }
    public static double summ (ArrayList<? extends Number> list){
        double summ = 0;
        for (Number n: list){
            summ += n.doubleValue();
        }
        return summ;
    }
}
