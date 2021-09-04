package test.multithreading;

public class Test17 {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: Try LOCK1");
        synchronized (Test17.lock1){
            System.out.println("Thread10: Get LOCK1");
            System.out.println("Thread10: Try LOCK2");
            synchronized (Test17.lock2){
                System.out.println("Thread10: Get LOCK1 and LOCK2");
            }
        }
    }
}


class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: Try LOCK2");
        synchronized (Test17.lock2){
            System.out.println("Thread20: Get LOCK2");
            System.out.println("Thread20: Try LOCK1");
            synchronized (Test17.lock1){
                System.out.println("Thread10: Get LOCK1 and LOCK2");
            }
        }
    }
}