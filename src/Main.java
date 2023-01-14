import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("FORD", "focus", 2.0);
        Car car2 = new Car("BMW", "520", 3.0);
        Car car3 = new Car("KIA", "Optima", 1.6);
        Car car4 = new Car("Автомобиль4", "Модель4", 2.4);

        Bus bus1 = new Bus("Автобус1", "Модель1", 4.0);
        Bus bus2 = new Bus("Автобус2", "Модель2", 5.0);
        Bus bus3 = new Bus("Автобус3", "Модель3", 6.0);
        Bus bus4 = new Bus("Автобус4", "Модель4", 6.0);

        Truck truck1 = new Truck("Грузовик1", "Модель1", 5.0);
        Truck truck2 = new Truck("Грузовик2", "Модель2", 6.0);
        Truck truck3 = new Truck("Грузовик3", "Модель3", 8.0);
        Truck truck4 = new Truck("Грузовик4", "Модель4", 8.0);

        printCarInfo(car1, car2, car3, car4);
        System.out.println();

        printBusInfo(bus1, bus2, bus3, bus4);
        System.out.println();

        printTruckInfo(truck1, truck2, truck3, truck4);
        System.out.println();

        car3.pitStop();
        bus2.maxSpeed(110);
        truck1.bestTime(53.6);
        System.out.println();

    }

    public static void printCarInfo (Car... car) {
        for (Car cars : car) {
            System.out.println(cars);
        }
    }
    public static void printBusInfo (Bus... bus) {
        for (Bus buses : bus) {
            System.out.println(buses);
        }
    }
    public static void printTruckInfo (Truck... truck) {
        for (Truck trucks : truck) {
            System.out.println(trucks);
        }
    }

}