package test.finalStatic;

import java.time.temporal.Temporal;

public class Final1 {
    public final int a = 10;
   // public final int b;
    public final int c;

    public Final1(int c) {
        this.c = c;
    }
    public Final1() {
        c = 0;
    }


    public static void main(String[] args) {
        Final1 final1 = new Final1();
        //final1.a = final1.a * 2;
        System.out.println(final1.a);
    }
}
