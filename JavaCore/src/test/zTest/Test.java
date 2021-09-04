package test.zTest;


public  class Test {
    public static void main(String[] args) {


//Given an array of integers. Check if there are
//two integers in the array with sum equals
//to specified value.

        int []  a = {2,4,5,6,7};

    }
    public boolean check(int[] a, int b){
        for (int i = 0; i <= a.length-1; i++){
          for (int j = i+1; j <= a.length; j++){
              int res = a[i] + a[j];
              if (res == b){
                  System.out.println(res + " - " + b);
                  break;
              }
              
          }
        }
    }
}
