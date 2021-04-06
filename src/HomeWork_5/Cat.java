package HomeWork_5;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        validateAge(age);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, int age){
        this.name = name;
        this.color = "Бандитский";
        this.age = age;
    }
    public Cat(){
        this("Степан","Бандитский",3 );
        System.out.println("Создаем кота, которого видим впервые");
    }

public String getName(){
        return this.name;
}
    public String getColor(){
        return this.color;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }
    private void validateAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        if (age > 25){
            throw new IllegalArgumentException("Коты столько не живут");
        }
    }
}


