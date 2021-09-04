package test.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("test.reflections.Employee");
//        Employee o = (Employee)employeeClass.newInstance();
//        System.out.println(o);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee e = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class,String.class,String.class);
        Object obj2 = constructor2.newInstance(5,"Bob", "IT" );
        System.out.println(obj2);


    }
}
