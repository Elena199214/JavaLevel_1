package HomeWork_7;

public class MyApp {
    public static void main(String[] args) {

        //Покорми кота


       Plate plate = new Plate(70);
        Cat [] cats = new Cat[5];
        cats[0] = new Cat("vaska", 15);
        cats[1] = new Cat("muska", 25);
        cats[2] = new Cat("murzik", 20);
        cats[3] = new Cat("nafany", 30);
        cats[4] = new Cat("treisy", 10);

        System.out.println("В миске " + plate.getFoodCount() + " грамм кошачьего корма, изначально она полная.\nКотики по очереди будут есть из миски.");

        for (Cat a : cats) {

            if  (a.isSatiety()== false) {
                    a.eat(plate);
                    a.info();
                    plate.info();
            }
        }
        System.out.println("Некоторые котики наелись, в миске осталось " + plate.getFoodCount() + " грамм кошачьего корма.");
    }
}
