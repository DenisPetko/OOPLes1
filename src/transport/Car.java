package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String typeCarCase;
    private String registrationNumber;
    private final int seats;
    private boolean summerTyre;
    private Key key;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_VALUE_ENGINE = 1.5;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 4;

    public Car(String brand, String model, double engineVolume,
               String color, int year, String country, String transmission,
               String typeCarCase, String registrationNumber, int seats,
               boolean summerTyre, Key key) {
        if (brand == null || brand.isEmpty()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }

        if (typeCarCase == null || typeCarCase.isEmpty()) {
            this.typeCarCase = DEFAULT_VALUE;
        } else {
            this.typeCarCase = typeCarCase;
        }

        if (seats <= 0) {
            this.seats = DEFAULT_SEATS;
        } else {
            this.seats = seats;
        }

        setEngineVolume(engineVolume);
        setColor(color);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setSummerTyre(summerTyre);
        setKey(key);
    }

    public static class Key {
        private final boolean remoteStartEngine;
        private final boolean nonKeyAccess;

        public Key(boolean remoteStartEngine, boolean nonKeyAccsess) {
            this.remoteStartEngine = remoteStartEngine;
            this.nonKeyAccess = nonKeyAccsess;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isNonKeyAccess() {
            return nonKeyAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartEngine=" + remoteStartEngine +
                    ", nonKeyAccess=" + nonKeyAccess +
                    '}';
        }
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

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeCarcase() {
        return typeCarCase;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = model;
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_VALUE_ENGINE;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setSummerTyre(boolean summerTyre) {
        this.summerTyre = summerTyre;
    }

    public void changeTyre(int month) {
        setSummerTyre(month > 2 && month < 12);
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key(false, false);
        } else {
            this.key = key;
        }
    }

    public boolean isRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;

    }

        public void printInfo() {
            System.out.println("brand='" + brand + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", engineVolume=" + getEngineVolume() +
                    ", color='" + getColor() + '\'' +
                    ", year=" + getYear() +
                    ", country='" + getCountry() + '\'');
        }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", typeCarCase='" + typeCarCase + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seats=" + seats +
                ", summerTyre=" + summerTyre +
                ", key=" + key +
                '}';
    }

}
