package org.springCrackers;

import org.springframework.stereotype.Component;

@Component
public class Turbine {
    private String boost ="1.0 bar";

    public String getBoost() {
        return boost;
    }

    public void setBoost(String boost) {
        this.boost = boost;
    }

    @Override
    public String toString() {
        return "turbine - boost " + boost;
    }
}
