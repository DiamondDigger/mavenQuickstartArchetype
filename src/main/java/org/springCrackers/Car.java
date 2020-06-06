package org.springCrackers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    private String brand = "unknown sleeper";

    @Autowired
    private Turbine turbine;

    public Turbine getTurbine() {
        return turbine;
    }

    public void setTurbine(Turbine turbine) {
        this.turbine = turbine;
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
        return "Car{" + brand +": " + turbine +
                '}';
    }
}
