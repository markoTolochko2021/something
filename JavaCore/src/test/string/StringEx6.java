package test.string;

public class StringEx6 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Yeeeeeeeey!!!!";
        String s3 = s1.concat(s2).trim().replace("Yeeeeeeeey", " Java").substring(6,10);
        System.out.println(s3);





    }
}
