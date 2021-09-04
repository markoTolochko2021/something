package test.multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test34 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Bob");
        list.add("Tod");
        list.add("Rob");
        list.add("Jim");
        list.add("Bim");
        list.add("Kim");
        System.out.println(list);
        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Jack");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
