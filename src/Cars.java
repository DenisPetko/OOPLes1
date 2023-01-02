public class Cars {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Cars(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.equals("")) {
            model = "default";
        }
        this.model = model;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.equals("")) {
            country = "default";
        }
        this.country = country;
        if (color == null || color.equals("")) {
            color = "белый";
        }
        this.color = color;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
