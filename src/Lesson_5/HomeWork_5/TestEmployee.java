package Lesson_5.HomeWork_5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0]= new Employee("Amina", "manager", "am@mail", "11-111", 50, 25);
        employeeArray[1]= new Employee("Larisa", "manager", "la@mail", "11-112", 40, 22);
        employeeArray[2]= new Employee("Anya", "manager", "an@mail", "11-113", 45, 45);
        employeeArray[3]= new Employee("Sasha", "manager", "sa@mail", "11-114", 38, 20);
        employeeArray[4]= new Employee("Gulia", "manager", "gu@mail", "11-115", 55, 42);

        Employee.ageCriteria(employeeArray);
    }
}
