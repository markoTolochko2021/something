package test.arrays;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] array = {113,1,35,12125,331,2,67,231,132,7};
        Arrays.sort(array);
       for (int i = 0; i < array.length; i++){
           System.out.println(array[i]);
       }
       int index1 = Arrays.binarySearch(array, 113);
        System.out.println(index1);
    }
}
