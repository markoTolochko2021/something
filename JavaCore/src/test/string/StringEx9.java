package test.string;

public class StringEx9 {
    public static void main(String[] args) {

        String s1 = new String("ok");
        String s2 = new String("ok");
        String s3 = "ok";
        String s4 = "ok";
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

    }
}
