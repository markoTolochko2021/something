package test.multithreading;

import java.util.PriorityQueue;

public class Test6 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.setName("my");
        thread5.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name of myThread5 = " + thread5.getName() +
                " Priority of thread5 = " + thread5.getPriority());

    }
}

class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");

    }
}
