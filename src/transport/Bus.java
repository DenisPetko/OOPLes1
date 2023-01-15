package transport;


import Drivers.CategoryD;

public class Bus extends Transport<CategoryD> {

    public Bus(String brand, String model, double engineVolume, CategoryD CategoryD) {
        super(brand, model, engineVolume, CategoryD);
    }

    @Override
    public void pitStop() {
        System.out.println("автобус " + getBrand() + " " + getModel() + " - на питстоп");
    }

    @Override
    public void bestTime(double bestTime) {
        System.out.println("автобус " + getBrand() + " " + getModel() + " - Лучшее время круга: " + bestTime);
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("автобус " + getBrand() + " " + getModel() + " - Максимальная скорость: " + maxSpeed);
    }
}

