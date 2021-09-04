package test.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class Test35 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        new Thread(() -> {
            int i = 0;
            while (true){
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer add: " + i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            int i = 0;
            while (true){
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Producer take: " + i);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
