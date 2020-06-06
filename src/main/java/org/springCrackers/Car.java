package org.springCrackers;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    private String brand;
    private int specificNumber;

    public Car(String brand, int specificNumber) {
        this.brand = brand;
        this.specificNumber = specificNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void drive() {
        System.out.println("You're driving your car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", specificNumber=" + specificNumber +
                '}';
    }
}
