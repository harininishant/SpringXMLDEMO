package io.pragra.learning.demo;

public class Car {
    private String carType;
    private IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public IEngine getEngine() {
        return engine;
    }

    public String getCarType() {
        return carType;
    }
}


