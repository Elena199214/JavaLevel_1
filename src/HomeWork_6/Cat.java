package HomeWork_6;

public class Cat  extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("кот мявкает");
    }
    public void voice(String mood){
        System.out.println("meow wich mood " + mood);
    }

    public void setColor(String color) {
        this.color = color;

    }
}
