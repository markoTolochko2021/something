package test.ExceptionsEX;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {4,8,3};
        System.out.println("We have array");

        try {
            System.out.println(array[5]);
        }
        catch (Exception e){
            System.out.println("We catch exception " + e);
        }
        finally {
            System.out.println("Good luck");
        }

    }
}
