package HomeWork_4;

import java.util.Random;
import java.util.Scanner;

public class CrossesZeroes {

    //Предположение. Человек ходит х. Программа - наоборот

    //Поле
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 2;
    
    //Константы символы
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    /**
     * Создать игровое поле и заполнить его пустыми точками.
     */
    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j]=DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        //нумерация столбцов
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            //вывод номера строки
            System.out.print((i+1) + " ");

            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Считать 2 числа. Установить значение Х
     */

    private static void humanTern() {
        int x, y;
        do{
            System.out.println("Введите координаты хода X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * Ход компьютера
     */
    private static void aiTurn() {
        int x,y;
        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(x, y));
        System.out.printf("Искуственный интеллект ходит: : %d %d",x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;
    }

    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            return false;
        }
        if(map[x][y] == DOT_EMPTY){
            return true;
        }
        return  false;
    }

    /**
     * Универсальная реализация.(для любого размера), для любого кол-ва выигрышных фишек
     * @param dot Х или О
     * @return победа или не до конца?
     */


    public static  boolean checkWin(char dot){

    //проверка по диагонали
        int count=1;

        for (int i = 0; i < SIZE-1; i++) {
            if ((map[i][i]==dot)&&(map[i][i]==map[i+1][i+1])|| (map[i][SIZE-i - 1]==dot)&&(map[i][i]==map[i+1][SIZE-i - 1-1])){
                count++;
            }
            if (count == DOTS_TO_WIN)
                    return true;
        }

        //проверка строк

        for (int i = 0; i < map.length-1; i++) {
            count=1;
            for (int j = 0; j < map[i].length-1; j++) {

          if ((map[i][j]== dot)&&(map[i][j]== map[i][j+1])){
              count++;
              if (count == DOTS_TO_WIN)
                  return true;
          }

       }
            }
        //проверка столбцов

        for (int i = 0; i < map.length-1; i++) {
            count=1;
            for (int j = 0; j < map[i].length-1; j++) {

                if ((map[j][i]== dot)&&(map[j][i]== map[j+1][i])){
                    count++;
                    if (count == DOTS_TO_WIN)
                        return true;
                }

            }
        }

        return false;
    }

    /**
     * Проверяет, что поле заполнено
     */
    public static boolean isFull(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static void play(){
        initMap();
        printMap();
        while (true){
            humanTern();
            printMap();
            if(checkWin(DOT_X)){
                System.out.println("Выиграл человек");
                break;
            }

            if(isFull()){
                System.out.println("Ничья");
                break;
            }
               aiTurn();
            printMap();
            if(checkWin(DOT_O)){
                System.out.println("Кожаный мешок, я победил");
                break;
            }
            if(isFull()){
                System.out.println("Ничья");
                break;
        }
    }

}

    public static void main(String[] args) {
        System.out.println("Я хочу сыграть с тобой в игру!");
        play();

    }

}

