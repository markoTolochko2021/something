package test.stringBuilder;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Good Day!!!");
        StringBuilder stringBuilder2 = new StringBuilder(50);
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder1.charAt(4));
        System.out.println(stringBuilder1.indexOf("d", 4));

        System.out.println(stringBuilder1.subSequence(5,8));
        System.out.println(stringBuilder1.append(22));
        System.out.println(stringBuilder1.insert(4,55));
        System.out.println(stringBuilder1.delete(4,6));
        System.out.println(stringBuilder1.delete(12,14));
        System.out.println(stringBuilder1.deleteCharAt(11));
        System.out.println(stringBuilder1.reverse());
        System.out.println(stringBuilder1.reverse());
        System.out.println(stringBuilder1.replace(8,11, "?"));
        System.out.println(stringBuilder1.capacity());
        System.out.println("**********************************");

        StringBuilder stringBuilder3 = new StringBuilder("ok");
        StringBuilder stringBuilder4 = new StringBuilder("ok");
        StringBuilder stringBuilder5 = stringBuilder4;
        System.out.println(stringBuilder3 == stringBuilder4);
        System.out.println(stringBuilder3.equals(stringBuilder4));
        System.out.println(stringBuilder4 == stringBuilder5);



    }
}
