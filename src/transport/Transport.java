package transport;
import Drivers.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {

    private String brand;
    private String model;
    private double engineVolume;
    private final T driver;
    private List<Driver> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
    }

    public void addDriver(Driver... driver) {
        this.drivers.addAll(Arrays.asList(driver));
    }

    public void addMechanic(Mechanic<?>... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
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

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

//    public T getDriver() {
//        return driver;
//    }

//    public T getMechanics() {
//        return mechanics;
//    }

    public abstract void printType();

    public void goService() {
        System.out.println(getBrand() + " " + getModel() + " на ТО");
    }

    public void repair() {
        System.out.println(getBrand() + " " + getModel() + " на ремонте");
    }

    @Override
    public String toString() {
        return "Транспорт: " + brand + " " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, drivers, mechanics);
    }
}
