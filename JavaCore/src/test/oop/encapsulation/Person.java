package test.oop.encapsulation;

public class Person {
    final String sex;

    public Person(String sex) {
        this.sex = sex;
    }
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
class Test{
    public static void main(String[] args) {

        Person person = new Person("male");
        person.setName("Bob");
        person.setAge(22);
        person.setWeight(60);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getWeight());
    }
}
