package test.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test4 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }
    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(()-> new Car("lada", "Kaluna", 3));
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 1;
            System.out.println("Upgraded car: " + car);
        });

    }

}

class Car{
    String model;
    String color;
    int engine;

    public Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
