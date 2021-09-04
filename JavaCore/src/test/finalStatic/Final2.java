package test.finalStatic;

public class Final2 {
    public static void main(String[] args) {

        Human human = new Human();
       // human.car = new Car();
        human.car.engine = "V8";
    }
}
class Car{
    String color = "Blue";
    String engine = "V6";

}
class Human{
    String name = "Jack";
   final Car car = new Car();
}
