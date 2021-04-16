package HomeWork_7;

public class Cat {
    private  String name;
    private  String color;
    private int age;
    private int appetite;
    private static int satiety=0;

    public Cat(String name, String color, int age) {
        super();
        validateAge(age);
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Cat(String name, int age) {
        this(name, "Бандитского", age);
    }
    public Cat() {
        this("Степан", "Бандитского", 3);
        System.out.println("Создаем кота, которого видим впервые");
    }

    public void info() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", appetite=" + appetite +
                '}';
    }

    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }
    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        if (age > 25) {
            throw new IllegalArgumentException("Коты столько не живут");
        }
    }

    public void eat(Plate plate) {
        plate.decreaseCount(this.appetite);
        satiety +=this.appetite;
        //plate.setFoodCount(plate.getFoodCount() - this.getAppetite());
    }

}
/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */