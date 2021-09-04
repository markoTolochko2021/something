package test.Stream;

import java.util.Arrays;

public class ForEachEx {
    public static void main(String[] args) {

        int[] array1 = {9, 4, 1, 2, 32, 5, 11};
        Arrays.stream(array1).forEach(el -> {
            el *= 2;
            System.out.print(el);
        });
        System.out.println();
        int[] array2 = {9, 4, 1, 2, 32, 5, 11};
        Arrays.stream(array2).forEach(el -> {
            System.out.print(el);
        });
        System.out.println();
        int[] array3 = {9, 4, 1, 2, 32, 5, 11};
        Arrays.stream(array3).forEach(System.out::print);
        Arrays.stream(array3).forEach(Utils::myNethod);
    }
}
class Utils{
    public static void myNethod(int a){
        a = a + 5;
        System.out.println("Element = " + a);
    }
}