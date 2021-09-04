package test.ExceptionsEX;

public class Test13 {

}
class Animal{
    void run(){
        System.out.println("Animal run");
    }
}
class Mouse extends Animal{
    @Override
    void run() {
        System.out.println("Mouse run");
    }
}