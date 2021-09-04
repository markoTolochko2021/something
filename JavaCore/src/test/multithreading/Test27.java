package test.multithreading;

import java.util.concurrent.Semaphore;

public class Test27 {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Mark", callBox);
        new Person("Bob", callBox);
        new Person("Nick", callBox);
        new Person("Jack", callBox);



    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " waiting");
        try {
            callBox.acquire();
            System.out.println(name + " using phone");
            sleep(2000);
            System.out.println(name + " finish call");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
