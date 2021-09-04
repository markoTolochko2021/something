package test.string;

public class StringEx2 {
    public static void main(String[] args) {

        String s1 = new String("hello");

        int a = s1.length();
        System.out.println(a);
        System.out.println("*******************************");
        char c = s1.charAt(3);
        System.out.println(c);
        System.out.println("*******************************");
        int i1 = s1.indexOf("o");
        System.out.println(i1);
        System.out.println("*******************************");
        int i2 = s1.indexOf("el");
        System.out.println(i2);
        System.out.println("*******************************");
        int i3 = s1.indexOf("Z");
        System.out.println(i3);
        System.out.println("*******************************");
        int i4 = s1.indexOf("l", 3);
        System.out.println(i4);
        System.out.println("*******************************");
        boolean b1 = s1.startsWith("he");
        System.out.println(b1);
        System.out.println("*******************************");
        boolean b2 = s1.startsWith("lo", 3);
        System.out.println(b2);
        System.out.println("*******************************");





    }
}
