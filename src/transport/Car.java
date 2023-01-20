package transport;


import Drivers.CategoryB;

public class Car extends Transport<CategoryB> {

    public enum TypeCarCase {

        SEDAN("Седан"), HETCH("Хетчбек"), CUPE("Купе"),
        UNIVERSAL("Универсал"), OFFROAD("Внедорожник"),
        CROSS("Кроссовер"), PIKAP("Пикап"),
        FURGON("Фургон"), MINIVEN("Минивэн");

        private final String russianName;

        TypeCarCase(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName() {
            return russianName;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + russianName;
        }
    }

    private TypeCarCase typeCarCase = TypeCarCase.SEDAN;

    public TypeCarCase getTypeCarCase() {
        return typeCarCase;
    }

    public void setTypeCarCase(TypeCarCase typeCarCase) {
        this.typeCarCase = typeCarCase;
    }

    public Car(String brand, String model, double engineVolume, CategoryB CategoryB) {
        super(brand, model, engineVolume, CategoryB);
    }

    @Override
    public void printType() {
        if (typeCarCase == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(typeCarCase);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("атвомобиль " + getBrand() + " " + getModel() + " - на питстоп");
    }

    @Override
    public void bestTime(double bestTime) {
        System.out.println("атвомобиль " + getBrand() + " " + getModel() + " - Лучшее время круга: " + bestTime);
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("атвомобиль " + getBrand() + " " + getModel() + " - Максимальная скорость: " + maxSpeed);
    }


}


