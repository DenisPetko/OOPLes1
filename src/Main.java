import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Cars[] cars = new Cars[5];
        cars[0] = new Cars();
        cars[0].brand = "Lada";
        cars[0].model = "Granta";
        cars[0].year = 2015;
        cars[0].country = "Россия";
        cars[0].color = "жёлтый";
        cars[0].engineVolume = 1.7;

        cars[1] = new Cars();
        cars[1].brand = "Audi";
        cars[1].model = "50 L TDI quattro";
        cars[1].year = 2020;
        cars[1].country = "Германия";
        cars[1].color = "черный";
        cars[1].engineVolume = 3.0;

        cars[2] = new Cars();
        cars[2].brand = "BMW";
        cars[2].model = "Z8";
        cars[2].year = 2021;
        cars[2].country = "Германия";
        cars[2].color = "черный";
        cars[2].engineVolume = 3.0;

        cars[3] = new Cars();
        cars[3].brand = "Kia";
        cars[3].model = "Sportage";
        cars[3].year = 2018;
        cars[3].country = "Южная Корея";
        cars[3].color = "красный";
        cars[3].engineVolume = 2.4;

        cars[4] = new Cars();
        cars[4].brand = "Hyundai";
        cars[4].model = "Avante";
        cars[4].year = 2016;
        cars[4].country = "Южная Корея";
        cars[4].color = "оранжевый";
        cars[4].engineVolume = 1.7;*/

        Cars[] cars = new Cars[5];
        cars[0] = new Cars("", "Granta", 2015, "Россия", "жёлтый", 0);
        cars[1] = new Cars("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
        cars[2] = new Cars("BMW", null, 2021, "Германия", "черный", 3.0);
        cars[3] = new Cars("Kia", "Sportage", 2018, null, "красный", 2.4);
        cars[4] = new Cars("Hyundai", "Avante", -3, "Южная Корея", "", 1.6);

        System.out.println(Arrays.toString(cars));
        //или так
        for (Cars car : cars) {
            System.out.println(car);
        }
    }
}