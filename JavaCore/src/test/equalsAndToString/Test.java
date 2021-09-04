package test.equalsAndToString;

import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("red", "v4");
        Car car2 = new Car("red", "v4");
        Car car3 = new Car("black", "v8");
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);

        System.out.println(car1.equals(car2));

    }
}

class Car{
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }


    public boolean equals(Object obj) {
        if (obj instanceof Car){
            return color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine);

        }
        else {
            return false;
        }
    }

}
