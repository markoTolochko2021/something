package test.multithreading;

import java.util.concurrent.CountDownLatch;

public class Test28 {

    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDown = " + countDownLatch.getCount());
    }
    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready to open market");
        countDownLatch.countDown();
        System.out.println("countDown = " + countDownLatch.getCount());
    } private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDown = " + countDownLatch.getCount());
    }
    public static void main(String[] args) throws InterruptedException {

        new Friend("Bob", countDownLatch);
        new Friend("Jack", countDownLatch);
        new Friend("Nick", countDownLatch);
        new Friend("Rob", countDownLatch);
        new Friend("Tod", countDownLatch);
        new Friend("Jim", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();



    }
}
class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " start shoping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

