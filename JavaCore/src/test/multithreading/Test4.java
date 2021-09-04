package test.multithreading;

public class Test4 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test4 thread1 = new Test4();
        thread1.start();

        for (int i = 1000; i >= 0; i--){
            System.out.println(i);
        }
    }
}
