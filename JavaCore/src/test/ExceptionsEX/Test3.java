package test.ExceptionsEX;

public class Test3 {
    void avc() {
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args) {
        int[] array = {4,8,3};
        try {
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception " + e);
        }

        System.out.println("Hello");

    }
}
