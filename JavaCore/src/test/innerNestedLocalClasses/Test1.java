package test.innerNestedLocalClasses;

public class Test1 {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        Car car = new Car("red", 2,e);
        System.out.println(e);
        System.out.println(car);
    }
}

class Car{
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public static class Engine{
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

