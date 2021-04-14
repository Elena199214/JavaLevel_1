package HomeWork_6;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska");
        Animal cat2 = new Cat("Murzik");
        Dog dog = new Dog("Sharik");
        cat.run(150);
        cat2.run(250);
        cat.swimming(150);
        cat2.swimming(150);
        dog.run(150);
        dog.swimming(8);
        Animal.countAnimals();

    }
}
