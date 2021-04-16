package HomeWork_7;

public class MyApp {
    public static void main(String[] args) {

        //Покорми кота

        Cat cat = new Cat();
        cat.setAppetite(30);
        Plate plate = new Plate(150);



        plate.setFoodCount(plate.getFoodCount() - cat.getAppetite());
        cat.info();
        plate.info();

        cat.eat(plate);

        cat.info();
        plate.info();

    }
}
