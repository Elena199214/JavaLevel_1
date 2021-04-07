package HomeWork_6;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Кто-то");
        Cat cat = new Cat("Vaska", "Brown");
        Dog dog = new Dog("Muhtar", "Simple dog");
        SiamCat siamCat = new SiamCat("Musy", "white",50);

        System.out.println("Animal name = " + animal.name);
        System.out.println("Animal name = " + cat.getName());
        System.out.println("Animal name = " + dog.getName());
        animal.voice();
        cat.voice();
        dog.voice();
        siamCat.voice();

        Animal someAnimal= new Cat("Boris", "red");
        Animal someAnimal2= new SiamCat("Boris", "red", 42);
        Animal someAnimal3= new Cat("Bobik", "usual");

        Animal[] animals = new Animal[]{someAnimal,someAnimal2,someAnimal3};
        for (Animal a: animals){
            if (a instanceof Dog){
                System.out.println("Это собака породы " + ((Dog)a).getBreed());
            }
            System.out.println(a.getName());
            a.voice();
        }


    }
}
