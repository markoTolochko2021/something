package test.multithreading;

import java.util.concurrent.locks.Lock;

public class Test16 {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }
    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }
    void viberCall() {
        synchronized (lock) {
            System.out.println("Viber call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Viber call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MobileRunnableImpl());
        Thread thread2 = new Thread(new SkypeRunnableImpl());
        Thread thread3 = new Thread(new ViberRunnableImpl());
        thread1.start();
        thread2.start();
        thread3.start();



    }
}

class MobileRunnableImpl implements Runnable{
    @Override
    public void run() {
        new Test16().mobileCall();
    }
}
class SkypeRunnableImpl implements Runnable{
    @Override
    public void run() {
        new Test16().skypeCall();
    }
}class ViberRunnableImpl implements Runnable{
    @Override
    public void run() {
        new Test16().viberCall();
    }
}
