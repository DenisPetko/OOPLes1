import Drivers.CategoryB;
import Drivers.CategoryC;
import Drivers.CategoryD;
import Drivers.Driver;
import transport.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CategoryB driver1 = new CategoryB("Водитель1", true, 1, "E");
        CategoryB driver2 = new CategoryB("Водитель2", true, 1, "B");
        CategoryB driver3 = new CategoryB("Водитель3", true, 1, "B");
        CategoryB driver4 = new CategoryB("Водитель4", true, 1, "B");

        CategoryC driver5 = new CategoryC("Водитель5", true, 1, "C");
        CategoryC driver6 = new CategoryC("Водитель6", true, 1, "C");
        CategoryC driver7 = new CategoryC("Водитель7", true, 1, "C");
        CategoryC driver8 = new CategoryC("Водитель8", true, 1, "C");

        CategoryD driver9 = new CategoryD("Водитель9", true, 1, "D");
        CategoryD driver10 = new CategoryD("Водитель10", true, 1, "D");
        CategoryD driver11 = new CategoryD("Водитель11", true, 1, "D");
        CategoryD driver12 = new CategoryD("Водитель12", true, 1, "D");

        Car car1 = new Car("FORD", "focus", 2.0, driver1);
        Car car2 = new Car("BMW", "520", 3.0, driver2);
        Car car3 = new Car("KIA", "Optima", 1.6, driver3);
        Car car4 = new Car("Автомобиль4", "Модель4", 2.4, driver4);

        Bus bus1 = new Bus("Автобус1", "Модель1", 4.0, driver9);
        Bus bus2 = new Bus("Автобус2", "Модель2", 5.0, driver10);
        Bus bus3 = new Bus("Автобус3", "Модель3", 6.0, driver11);
        Bus bus4 = new Bus("Автобус4", "Модель4", 6.0, driver12);

        Truck truck1 = new Truck("Грузовик1", "Модель1", 5.0, driver5);
        Truck truck2 = new Truck("Грузовик2", "Модель2", 6.0, driver6);
        Truck truck3 = new Truck("Грузовик3", "Модель3", 8.0, driver7);
        Truck truck4 = new Truck("Грузовик4", "Модель4", 8.0, driver8);

        Mechanic<Transport<?>> mechanic1 = new Mechanic<>("Механик 1", "CarService");
        Mechanic<Bus> mechanic2 = new Mechanic<>("Механик 2", "BusService");
        Mechanic<Truck> mechanic3 = new Mechanic<>("Механик 3", "TruckService");

        car1.addMechanic(mechanic1, mechanic2);
        car1.addDriver(driver1, driver2, driver3);

        System.out.println(car1.getDrivers());
        System.out.println(car1.getMechanics());

//        bus2.addMechanic(mechanic2);
//        bus2.addDriver(driver4);

        truck3.addMechanic(mechanic3);
        truck3.addDriver(driver9);

        System.out.println();
        List<Transport<?>> transports = List.of(
                car1, car2, car3, car4,
                bus1, bus2, bus3, bus4,
                truck1, truck2, truck3, truck4
        );

        List<Driver> drivers = List.of(
                driver1, driver2, driver3,
                driver4, driver5, driver6,
                driver7, driver8, driver9,
                driver10, driver11, driver12
        );

        List<Mechanic<?>> mechanics = List.of(
                mechanic1, mechanic2, mechanic3
        );

        System.out.println(transports);
        System.out.println(drivers);
        System.out.println(mechanics);
        System.out.println();

        car1.goService();
        truck2.repair();
        mechanic3.goService(truck1);
        mechanic1.repair(car2);
        System.out.println();

        Map<Transport<?>, Mechanic<?>> mechanicMap = new HashMap<>();
        mechanicMap.put(car1, mechanic1);
        mechanicMap.put(car2, mechanic2);
        mechanicMap.put(car2, mechanic2);
        mechanicMap.put(car3, mechanic3);
        mechanicMap.put(truck1, mechanic1);
        mechanicMap.put(truck2, mechanic2);

        System.out.println(mechanicMap);





    }

    public static void printCarInfo(Car... car) {
        for (Car cars : car) {
            System.out.println(cars);
        }
    }

    public static void printBusInfo(Bus... bus) {
        for (Bus buses : bus) {
            System.out.println(buses);
        }
    }

    public static void printTruckInfo(Truck... truck) {
        for (Truck trucks : truck) {
            System.out.println(trucks);
        }
    }

}