package HomeWork_6;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
        this.runLimit = 200;

    }

    @Override
    protected void swimming(int obstacleLength) {
        System.out.println("Коты не умеют плавать!");
    }
}
