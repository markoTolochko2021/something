package test.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test19 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        new Employee("Jim", lock);
        new Employee("Bim", lock);
        new Employee("Jack", lock);
        new Employee("Daniels", lock);

    }

}
class Employee extends Thread{
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
//        System.out.println(name + " waiting....");
//        lock.lock();
        if (lock.tryLock()) {
            try {
                System.out.println(name + " use machine...");
                Thread.sleep(2000);
                System.out.println(name + " finish ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " dont want wait");
        }
    }
}
