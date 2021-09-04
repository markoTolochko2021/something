package test.multithreading;

public class Test12 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }

}

class Counter{
    static int count = 0;
}

class MyRunnableImpl1 implements Runnable{

    synchronized public void increment(){
        Counter2.count++;
        System.out.print (Counter2.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            increment();
        }
    }
}
