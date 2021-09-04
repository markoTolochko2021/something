package test.multithreading;

public class Test11 extends Thread{
   volatile boolean b= true;

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished.counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Test11 thread = new Test11();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 sec time to  wake up");
        thread.b = false;
        thread.join();
        System.out.println("The End!!!");




    }
}
