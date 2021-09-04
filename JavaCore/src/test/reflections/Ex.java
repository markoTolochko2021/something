package test.reflections;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass1 = Class.forName("test.reflections.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee employee = new Employee();
//        Class employeeClass3 = employee.getClass();

//       Field someField = employeeClass1.getField("id");
//        System.out.println(someField.getType());
//
//       Field[]fields = employeeClass1.getFields();
//       for (Field field: fields){
//           System.out.println(field.getName() + " " + field.getType());
//       }
//
//        Field[]fields =  employeeClass1.getDeclaredFields();
//        for (Field field: fields){
//            System.out.println(field.getName() + " " + field.getType());
//        }

       Method method = employeeClass1.getMethod("increaseSalary");
        System.out.println(method.getReturnType());
        System.out.println(Arrays.toString(method.getParameterTypes()));

        Method method1 = employeeClass1.getMethod("setSalary", double.class);
        System.out.println(method1.getReturnType());
        System.out.println(Arrays.toString(method1.getParameterTypes()));

        Method[] methods = employeeClass1.getMethods();
        for (Method m: methods){
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(Arrays.toString(m.getParameterTypes()));

        }
        Method[] allMethods = employeeClass1.getDeclaredMethods();
        for (Method m: allMethods){
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(Arrays.toString(m.getParameterTypes()));

        }
        Method[] allMethods2 = employeeClass1.getMethods();
        for (Method m: methods){
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println(m.getName());
                System.out.println(m.getReturnType());
                System.out.println(Arrays.toString(m.getParameterTypes()));
            }
        }

    }
}
