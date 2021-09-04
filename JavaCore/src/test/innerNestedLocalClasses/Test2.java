package test.innerNestedLocalClasses;

public class Test2 {
    public static void main(String[] args) {

        Car2 car2 = new Car2("Black", 4);
        Car2.Engine engine = car2.new Engine(150);
        car2.setEngine(engine);
        System.out.println(car2);
    }
}

class Car2{
    String color;
    int doorCount;
    Engine engine;

    public Car2(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine){
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
    public  class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

