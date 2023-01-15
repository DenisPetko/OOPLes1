package transport;


import Drivers.CategoryC;
import Drivers.Driver;

public class Truck extends Transport<CategoryC> {

    public Truck(String brand, String model, double engineVolume, CategoryC CategoryC) {
        super(brand, model, engineVolume, CategoryC);
    }

    @Override
    public void pitStop() {
        System.out.println("грузовик " + getBrand() + " " + getModel() + " - на питстоп");
    }

    @Override
    public void bestTime(double bestTime) {
        System.out.println("грузовик " + getBrand() + " " + getModel() + " - Лучшее время круга: " + bestTime);
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("грузовик " + getBrand() + " " + getModel() + " - Максимальная скорость: " + maxSpeed);
    }

}
