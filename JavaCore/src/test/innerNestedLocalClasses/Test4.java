package test.innerNestedLocalClasses;

public class Test4 {
    public static void main(String[] args) {
        Math1 m = new Math1() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(3,6));

        Math1 m1 = new Math1() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(3,6));




    }
}

interface Math1{
    int doOperation(int a, int b);
}
