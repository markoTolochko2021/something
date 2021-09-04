package test.algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{64,42,73,41,31,53,16,24,57,42,74,55,36};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
              }
            }
        for (Integer integer: array){
            System.out.print(integer + ", ");
        }


    }
}
