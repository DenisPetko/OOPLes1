package transport;


public abstract class Transport implements Competing {

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        super();
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void startMove() {
        System.out.println(getBrand() + " " + getModel() + " - поехали");
    }

    public void stopMove() {
        System.out.println(getBrand() + " " + getModel() + " - стоп");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " - на питстоп");
    }

    @Override
    public void bestTime(double bestTime) {
        System.out.println(getBrand() + " " + getModel() + " - Лучшее время круга: " + bestTime);
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println(getBrand() + " " + getModel() + " - Максимальная скорость: " + maxSpeed);
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

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
