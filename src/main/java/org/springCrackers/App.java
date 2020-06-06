package org.springCrackers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle obj = (Vehicle) context.getBean("car");
        System.out.println("obj.getClass() = " + obj.getClass());
        obj.drive();
        System.out.println(obj);

        obj= (Vehicle) context.getBean("bike");
        System.out.println("obj.getClass() = " + obj.getClass());
        obj.drive();


        System.out.println("context.getBeanNamesForType(Vehicle.class) ="+Arrays.toString(context.getBeanNamesForType(Vehicle.class)));
    }
}
