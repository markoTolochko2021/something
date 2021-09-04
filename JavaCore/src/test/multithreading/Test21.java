package test.multithreading;

public class Test21 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread1 = new InterruptedThread();
        thread1.start();
        Thread.sleep(2000);
        thread1.interrupt();
        thread1.join();
        System.out.println("main ends");
    }
}
class InterruptedThread extends Thread{

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++){
            if (isInterrupted()){
                System.out.println("thread want interrupt");
                System.out.println("Finish thread");
                System.out.println(sqrtSum);

                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread want stop in sleep mod, lets finish him");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}

