package test.oop.abstractEx;

public class Test {

}
abstract class Figure {
    int kilkistStorin;
    abstract void perimetr();
    abstract void ploshcha();
    void showInfo(){
        System.out.println("this is figure");
    }

}
class Kvadrat extends Figure{
    int kilkiststorin = 4;
    int storona = 10;
    @Override
    void perimetr() {
        System.out.println("perimetr = " + kilkiststorin * storona);
    }

    @Override
    void ploshcha() {
        System.out.println("ploshcha = " + storona * storona);
    }
}
class Krug extends Figure{
    int kilkiststorin = 0;
    int radius = 22;

    @Override
    void perimetr() {
        System.out.println("perimetr = " + 2 * 3.14 * radius
        );
    }

    @Override
    void ploshcha() {
        System.out.println("ploshcha = " + 3.14 * radius * radius
        );
    }
}
class pryamokutuk extends Figure{
    int storona1 = 8;
    int storona2 = 4;

    @Override
    void perimetr() {
        System.out.println("perimetr = " + 2 * (storona1 + storona2)
        );
    }

    @Override
    void ploshcha() {
        System.out.println("ploshcha = " + storona2 * storona1
        );

    }
}
