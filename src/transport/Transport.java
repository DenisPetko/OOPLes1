package transport;

import Drivers.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {

    private String brand;
    private String model;
    private double engineVolume;
    private final T driver;
    private List<Driver<?>> drivers = new ArrayList<>(); // надо перенастроить дженерики??
    private List<Mec>;// почему не видит механиков ??


    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
    }

    public void addDriver(Driver<?> driver) {  // надо перенастроить дженерики??

    }
    public void addMechanic(Mechanic<?> mechanic) {    // почему не видит механиков ??

    }

    public void startMove() {
        System.out.println(getBrand() + " " + getModel() + " - поехали");
    }

    public void stopMove() {
        System.out.println(getBrand() + " " + getModel() + " - стоп");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "нет информаии";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "нет информаии";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public T getDriver() {
        return driver;
    }

    public abstract void printType();

    public abstract boolean goService();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
