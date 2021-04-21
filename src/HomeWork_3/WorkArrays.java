package HomeWork_3;

import java.util.Arrays;

public class WorkArrays {

    public static void main(String[] args) {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array2 = {11, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] array3 = {2, 2, 2, 1, 2, 2, 10, 1, 1};
        int[] array4 = {5, 2, 2, 3};
        int[] array5 = {10, 10};

        replacingNumbers(array);
        fillArray();
        selectiveMultiplication(array2);
        fillDiagonals(3);
        initialValueArray(3, 111);
        minMaxArray();
        checkBalance(array);
        checkBalance(array2);
        checkBalance(array3);
        checkBalance(array4);
        checkBalance(array5);
//        shiftArray();  пока в работе...

    }


    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    private static void replacingNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    private static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void selectiveMultiplication(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
 то есть [0][0], [1][1], [2][2], …, [n][n];*/
    private static void fillDiagonals(int size) {
        int[][] array = new int[size][size];

        int i;
        for (i = 0; i < array.length; ++i) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }

        for (i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                System.out.print(array[i][j]);
            }

            System.out.println();
        }
    }


    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue;
    */
    private static int[] initialValueArray(int len, int initialValue) {
        int[] array = new int[len];

//        for (int i = 0; i < len; ++i) {
//            array[i] = initialValue;
//        }
        Arrays.fill(array, initialValue);

        System.out.println(Arrays.toString(array));
        return array;
    }


// 6.  Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    private static void minMaxArray() {
        int[] array = {-2, 8, 4, 9, -5};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.printf("Минимальное значение в массиве %d, максимальное %d", min, max);
        System.out.println();
    }

/*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.*/


    private static boolean checkBalance(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        boolean result = false;


        if (array.length > 1) {
            for (int i = 0; i < array.length / 2; i++) {
                sumLeft += array[i];
                sumRight += array[array.length - 1 - i];
                if (i == (array.length / 2 - 1) && array.length % 2 != 0) {
                    sumRight += array[array.length - 2 - i];
                }
            }

            if (sumLeft > sumRight) {
                for (int i = array.length / 2; i < array.length; i++) {
                    sumLeft -= array[i];
                    sumRight += array[i];
                    if (sumLeft == sumRight) {
                        result = true;
                        break;
                    }
                }
            }
            if (sumLeft < sumRight) {
                for (int i = array.length / 2; i < array.length; i++) {
                    sumLeft += array[i];
                    sumRight -= array[i];
                    if (sumLeft == sumRight) {
                        result = true;
                        break;
                    }

                }
            } else {
                result = true;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array) +" "+ result);

        return result;
    }


/* 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 При каком n в какую сторону сдвиг можете выбирать сами.*/

}