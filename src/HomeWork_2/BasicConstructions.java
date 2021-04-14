package HomeWork_2;

public class BasicConstructions {

    public static void main(String[] args) {
        sumLimit(8, 3);
        sumLimit(10, 20);
        positiveOrNegative(-4);
        positiveOrNegative(0);
        System.out.println(isNegative(-5));
        System.out.println(isNegative(5));;
        printString("Hello World", 5);
        printString("Hello", 2);
        leapНear(2020);
        leapНear(2021);

    }

//1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static boolean sumLimit(int a, int b) {
        int sum = a+b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    private static void positiveOrNegative(int a) {
        if (a >= 0){
            System.out.println("Передали число положительное");
        }
        else {
            System.out.println("Передали число отрицательное");
        }
    }
/*
Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

1 )Название. isNegative подойдет лучше всего :) сейчас метод вернет true, если число положительно. А хотим наоборот

else; - можно не писать. Оно не сработает

можно сразу писать return true; return false; без объявления переменных
 */
    private static boolean isNegative(int a) {

        if (a >= 0) {
            return false;
        }

        return true;
    }


    private static void printString(String a,int b ) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    private static boolean leapНear(int year) {
        boolean a = false;
        if (year % 4 == 0 && year % 100 != 0 || year == 400){
            System.out.println(year + " год является високосным");
            return true;
        }
        System.out.println(year + " год не високосный");
        return false;
    }


}
