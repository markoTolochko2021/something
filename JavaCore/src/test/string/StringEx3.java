package test.string;

public class StringEx3 {
    public static void main(String[] args) {
        String s1 = "abcdefgabcd";
        String forTrim = "     abc     ";

        String s2 = s1.substring(3);
        System.out.println(s2);

        String s3 = s2.trim();
        System.out.println(s3);
        String s4 = forTrim.trim();
        System.out.println(s4);

        String s5 = s1.replace('a', 'o');
        System.out.println(s5);
        String s6 = s1.replace("abc", "123");
        System.out.println(s6);

        String s7 = "ok  " + "ok1" + "ok2";
        System.out.println(s7);
    }
}
