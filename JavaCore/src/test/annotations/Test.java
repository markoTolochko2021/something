package test.annotations;

public class Test {
    public static void main(String[] args) {

        Parent p = new Child("Bob");
        p.showInfo();

    }
}
class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
    @Deprecated
    void showInfo(){
        System.out.println("Its parent class Name = " + name);
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }
    @Override
    void showInfo(){
        System.out.println("Its child class Name = " + name);
    }
}

