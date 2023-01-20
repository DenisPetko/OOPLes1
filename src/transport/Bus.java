package transport;


import Drivers.CategoryD;

public class Bus extends Transport<CategoryD> {

    public enum CapacityBus {
        VERY_SMALL(null, 10), SMALL(null, 25),
        MID(40, 50), BIG(60, 80),
        VERY_BIG(100, 120);
        private final Integer minCapacityBus;
        private final Integer maxCapacityBus;

        CapacityBus(Integer minCapacityBus, Integer maxCapacityBus) {
            this.minCapacityBus = minCapacityBus;
            this.maxCapacityBus = maxCapacityBus;
        }

        public Integer getMinCapacityBus() {
            return minCapacityBus;
        }

        public Integer getMaxCapacityBus() {
            return maxCapacityBus;
        }

        @Override
        public String toString() {
            if (minCapacityBus == null) {
                return "Вместимость: до " + maxCapacityBus + " человек";
            }
            if (maxCapacityBus == null) {
                return "Вместимость: свыше " + minCapacityBus + " человек";
            }
            return "Вместимость: от " + minCapacityBus + " до " + maxCapacityBus + " человек";
        }

    }

    private CapacityBus capacityBus = CapacityBus.VERY_BIG;

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }

    public void setCapacityBus(CapacityBus capacityBus) {
        this.capacityBus = capacityBus;
    }

    @Override
    public void printType() {
        if (capacityBus == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacityBus);
        }
    }

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

