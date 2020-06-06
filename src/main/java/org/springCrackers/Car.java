package org.springCrackers;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("You're driving your car");
    }
}
