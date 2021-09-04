package com.spring.rest;

import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> alEemployees = communication.getAllEmployees();
//        System.out.println(alEemployees);
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);
        Employee emp = new Employee("Joe", "Putin", "Sales", 300);
        communication.saveEmployee(emp);
    }
}
