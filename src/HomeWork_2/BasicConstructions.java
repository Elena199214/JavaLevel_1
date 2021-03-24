package HomeWork_2;

public class BasicConstructions {

    public static void main(String[] args) {
        sumLimit(8, 3);
        sumLimit(10, 20);
        positiveOrNegative(-4);
        positiveOrNegative(0);
        trueOrFalse(-5);
        trueOrFalse(5);
        printString("Hello World", 5);
        printString("Hello", 2);
        leapНear(2020);
        leapНear(2021);

    }


    private static void sumLimit(int a, int b) {

        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
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

    private static boolean trueOrFalse(int a) {
        boolean b = false;

        if (a >= 0) {
            b = true;
        }
        else;

        System.out.println(b);
        return b;
    }

    private static void printString(String a,int b ) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    private static boolean leapНear(int year) {
        boolean a = false;
        if (year % 4 == 0 && year % 100 != 0 || year == 400){
            a = true;
        }
        System.out.println(a);
        return a;
    }


}
