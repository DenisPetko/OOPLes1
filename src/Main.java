import transport.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механическая", "седан", "Р985УХ197", 4, true, new Car.Key(true, true));
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "роботизированная", "седан", "Р985УХ197", 4, true, null);
        cars[2] = new Car("BMW", null, 3.0, "черный", 2021, "Германия", "роботизированная", "купэ", "Р985УХ197", 2, true, null);
        cars[3] = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", "автоматическая", "кроссовер", "Р985УХ197", 5, false, null);
        cars[4] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автоматическая", "седан", "Р985УХ197", 5, false, null);

        cars[0].changeTyre(4);
        cars[0].setRegistrationNumber("A777АА777");
        System.out.println(cars[0].isRegistrationNumber());
        for (Car car : cars) {
            System.out.println(car);
        }

        cars[0].printInfo();
        cars[1].printInfo();

    }
}