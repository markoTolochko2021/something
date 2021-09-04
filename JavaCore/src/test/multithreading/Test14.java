package test.multithreading;

public class Test14 {
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

class Counter2 {
    static int count = 0;
}

class MyRunnableImpl2 implements Runnable{

    private void increment2(){
        System.out.println("Yeeeee!!");

    }

    private void increment() {
        increment2();
        synchronized (this) {
            Counter2.count++;
            System.out.print(Counter2.count + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            increment();
        }
    }
}
