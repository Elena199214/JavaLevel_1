package HomeWork_5;

public class MyApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька",5);



        System.out.println("Имя " + cat.getName() + "Цвет "+ cat.getColor() + "Возраст " + cat.getAge());

        Cat cat2 = new Cat("Борис","Энергичный",5);


        System.out.println(cat);

    }
}
