package test.arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] array = {22,42,1,67,3,11,7,9,4};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Max" + max);
        System.out.println("Min" + min);


    }
}
