package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String typeCarcase;
    private String registrationNumber;
    private final int seats;
    private boolean summerTyre;


    public Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String typeCarcase, String registrationNumber, int seats, boolean summerTyre) {
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

        if (transmission == null || transmission.equals("")) {
            transmission = "автоматическая";
        }
        this.transmission = transmission;

        if (typeCarcase == null || typeCarcase.equals("")) {
            typeCarcase = "седан";
        }
        this.typeCarcase = typeCarcase;

        if (registrationNumber == null || registrationNumber.equals("")) {
            registrationNumber = "х000хх000";
        }
        this.registrationNumber = registrationNumber;

        if (seats == 0) {
            seats = 4;
        }
        this.seats = seats;

        this.summerTyre = summerTyre;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeCarcase() {
        return typeCarcase;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerTyre(boolean summerTyre) {
        this.summerTyre = summerTyre;
    }

    public void changeTyre(int month) {
        if (month == 12 || (month > 0 && month <3)) {
            summerTyre = !summerTyre;
        }
    }

    public boolean isRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }




    @Override

    public String toString() {
        return "transport.Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                "transmission='" + transmission + '\'' +
                ", typeCarcase='" + typeCarcase + '\'' +
                "registrationNumber='" + registrationNumber + '\'' +
                ", seats='" + seats + '\'' +
                ", summerTyre='" + summerTyre + '\'' +
                '}';
    }
}
