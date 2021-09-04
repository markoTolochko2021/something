package test.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test18 {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.viberCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
class Call{
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void skypeCall(){
        lock.lock();
        System.out.println("SkypeCall starts");
        try {
            Thread.sleep(5000);
            System.out.println("SkypeCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void viberCall(){
        lock.lock();
        System.out.println("ViberCall starts");
        try {
            Thread.sleep(7000);
            System.out.println("ViberCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();

        }
    }
}

