package transport;


import Drivers.CategoryB;
import Drivers.Driver;

public class Car extends Transport<CategoryB> {

    public Car(String brand, String model, double engineVolume, CategoryB CategoryB) {
        super(brand, model, engineVolume, CategoryB);
    }

    @Override
    public void pitStop() {
        System.out.println("атвомобиль " + getBrand() + " " + getModel() + " - на питстоп");
    }

    @Override
    public void bestTime(double bestTime) {
        System.out.println("атвомобиль " + getBrand() + " " + getModel() + " - Лучшее время круга: " + bestTime);
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("атвомобиль " + getBrand() + " " + getModel() + " - Максимальная скорость: " + maxSpeed);
    }

}


