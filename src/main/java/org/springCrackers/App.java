package org.springCrackers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NoSuchFieldException {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Turbine turbine = (Turbine) context.getBean("turbine");
        turbine.setBoost("3.0 bar");
        System.out.println(turbine);
        System.out.println("************************");

        Vehicle obj = (Vehicle) context.getBean("car");
        System.out.println("obj.getClass() = " + obj.getClass());
        obj.drive();
        System.out.println(obj);
        System.out.println("************************");



        System.out.println("context.getBeanNamesForType(Vehicle.class) ="+Arrays.toString(context.getBeanNamesForType(Vehicle.class)));
    }
}
