package HomeWork_7;

public class MyApp {
    public static void main(String[] args) {

        //Покорми кота

//        Cat cat = new Cat();
//        cat.setAppetite(30);
//        Plate plate = new Plate(150);
//
//
//
//        plate.setFoodCount(plate.getFoodCount() - cat.getAppetite());
//        cat.info();
//        plate.info();
//
//        cat.eat(plate);
//
//        cat.info();
//        plate.info();
//        plate.fillPlate(plate,100);
//        plate.info();

        Plate plate = new Plate(80);
        Cat [] cats = new Cat[5];
        cats[0] = new Cat("vaska", 15);
        cats[1] = new Cat("muska", 25);
        cats[2] = new Cat("murzik", 20);
        cats[3] = new Cat("nafany", 30);
        cats[4] = new Cat("treisy", 10);

        for (int i = 0; i < 5; i++) {
            cats[i].eat(plate);
            plate.info();
        }
    }
}
