package test.multithreading;

public class Test10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread1 = new Thread(new Worker());
        thread1.start();
        thread1.join(1500);

        System.out.println("Method main ends");


    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins ");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
