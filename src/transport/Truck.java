package transport;


import Drivers.CategoryC;

public class Truck extends Transport<CategoryC> {

    public enum Capacity {

        N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);

        private final Float minCapacity;
        private final Float maxCapacity;

        Capacity(Float minCapacity, Float maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        public float getMinCapacity() {
            return minCapacity;
        }

        public float getMaxCapacity() {
            return maxCapacity;
        }

        @Override
        public String toString() {
            if (minCapacity == null) {
                return "Грузоподъемность: до " + maxCapacity + " тонн";
            }
            if (maxCapacity == null) {
                return "Грузоподъемность: свыше " + minCapacity + " тонн";
            }
            return "Грузоподъемность: от " + minCapacity + " до " + maxCapacity + " тонн";
        }

    }

    Capacity capacity = Capacity.N1;

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Truck(String brand, String model, double engineVolume, CategoryC CategoryC) {
        super(brand, model, engineVolume, CategoryC);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacity);
        }
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
