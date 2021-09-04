package test.string;

public class StringEx1 {
    public static void main(String[] args) {

        Car c1 = new Car("red", "V6");
        Car c2 = c1.adc("black");
        System.out.println(c1.color);

    }
}

class Car{
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
   final static int a = 5;

    public Car adc(String color){
        Car c10 = new Car(color, "V4");
        return c10;
    }
}

