package Lesson_5.HomeWork_5;

public class Employee {

     String name, position, email, telephone;
     int salary, age;

    public Employee(String name, String position, String email, String telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void ageCriteria(Employee [] array){
        for (Employee a: array) {
            if(a.age>=40){
                System.out.println(a.toString());
        }

        }
    }
}
