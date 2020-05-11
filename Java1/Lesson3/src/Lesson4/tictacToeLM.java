package Lesson4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tictacToeLM {
    static char [][] createEmptyTable(int len) {
        char [][] table = new char[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                table[i][j] = '_';
            }
        }
        return table;
    }

    static void show(char [][] table) {
        int len = table.length;
        System.out.print("   ");
        for (int i = 0; i < len; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < len; j++) {
                System.out.print("|" + table[i][j]);
            }
            System.out.println("|");
        }
    }

    private static boolean isValid(int x, int y, char[][] table) {
        int l = table.length - 1;
        if (x < 0 || x > l) return false;
        if (y < 0 || y > l) return false;
        return table[x][y] == '_';
    }

    private static boolean isVictory(char[][] table, char x) {
        int len = table.length;
        for (int i = 0; i < table.length; i++) {
            int sX = 0, sY = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < table.length; j++) {
                sX += table[i][j] == x ? 1 : 0;
                sY += table[j][i] == x ? 1 : 0;
                d1 += table[j][j] == x ? 1 : 0;
                d2 += table[j][len - j - 1] == x ? 1 : 0;
            }
            if (sX == len || sY == len
                    || d1 == len || d2 == len) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // XO 3 * 3
        int counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Игра: крестики нолики");
        System.out.println("Введите размер игрового поля");
        int n = in.nextInt();
        System.out.printf("Игровое поле %d X %d\n", n, n);
        char [][] table = createEmptyTable(n);
        show(table);
        while (true) {
            System.out.println("Для того, чтобы совершить ход:" +
                    " введите номер строки и номер столбца игрового поля");
            int x = in.nextInt(), y = in.nextInt();
            x--; y--;
             //alt + enter
        if (isValid(x, y, table)) {
            table[x][y] = 'X';
            counter++;
            show(table);
        } else {
            System.out.println("Введены некорректные данные");
            continue;
        }
        if (isVictory(table, 'X')) {
            System.out.println("Вы победили!");
            break;
            //new game ?
        }
            if (counter == 9) {
                System.out.println("Ничья!");
                break;
            }
            System.out.println("Компьютер думает над ходом");
            for (int i = 0; i < 9; i++) {
                System.out.print(" * ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            movePCRandom(table);
            counter++;
            show(table);
            if(isVictory(table, 'O')) {
                System.out.println("Вы проиграли!");
                break;
            }
        }
    }
    private static void movePCRandom(char[][] table) {
        Random rnd = new Random();
        int len = table.length;
        while (true) {
            int x = rnd.nextInt(len), y = rnd.nextInt(len);
            if (isValid(x, y, table)) {
                table[x][y] = 'O';
                return;
            }
        }
    }

    private static void movePCEasy(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == '_') {
                    table[i][j] = 'O';
                    return;
                }
            }
        }
    }

    private static void movePCHard(char[][] table) {
        // TODO: 13.02.2020
        // HomeWork
    }

}