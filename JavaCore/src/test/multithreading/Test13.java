package test.multithreading;

public class Test13 {
    volatile static int counter = 0;
    public  synchronized static void increment(){
         counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            Test13.increment();
        }
    }
}
