package test.ioNio.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {

        Car car = new Car("BMW", "White");
/*
        Employee employee = new Employee("Jack", "Daniels","IT", 30, 1000, car);
*/
        try (ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("employees2.bin"));
        ){
/*
            outputStream.writeObject(employee);
*/
            System.out.println("Done!!!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
