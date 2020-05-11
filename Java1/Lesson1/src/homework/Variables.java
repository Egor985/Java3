package homework;

import java.util.Scanner;

public class Variables {

    private static void hello() {
        Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут? ");
        String name = in.nextLine();
        System.out.println("Привет " + name);
    }

    private static void Variables() {
        byte bt = 76; // диапазон -128...127
        System.out.println(bt);
        short sh = 15000; //диапазон -32768 до 32767
        System.out.println(sh);
        int i = -115479879; //от -2 147 483 648 до 2147483647
        System.out.println(i);
        long l = 2372036854775L; //от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        System.out.println(l);
        float fl = 65.5555555555555555555f; //-3.4*10**38 до 3.4*10**38
        System.out.println(fl);
        double db = fl*3; //от ±4.9*10**-324 до ±1.8*10**308
        System.out.println(db);
        char ch = 'f';//от 0 до 65535
        System.out.println(ch);
        boolean bl = ch > 'K'; //true или false
        System.out.println(bl);
    }

    private static void result() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 4 числа:");
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.print("c: ");
        int c = in.nextInt();
        System.out.print("d: ");
        int d = in.nextInt();
        int e = a * (b + (c / d));
        System.out.print("a * (b + (c / d)) равно: ");
        System.out.println(e);
    }

    private static void positiveNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int j = in.nextInt();
        if (j >=0){
            System.out.print("Вы ввели положительное число.");
        } else {
            System.out.println("Вы ввели отрицательное число.");
        }
    }

    private static void summ() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        System.out.print("a: ");
        int f = in.nextInt();
        System.out.print("b: ");
        int g = in.nextInt();
        int h = f + g;
        System.out.println("Сумма этих двух чисел лежит в интервале от 10 до 20?");
        boolean bool = h >= 10 && h <= 20;
        System.out.println(bool);
    }

    private static void negative() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int k = in.nextInt();
        if (k < 0) System.out.println("true");
    }

    private static void message() {
        System.out.println("В данной работе представленны различные методы, с каким методом вы хотели бы познакомиться:");
        System.out.println("1 - Создание переменных всех пройденных типов данных, и инициализация их значений;");
        System.out.println("2 - Метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;");
        System.out.println("3 - Метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно)");
        System.out.println("4 - Метод, которому в качестве параметра передается целое число, печатает в консоль положительное ли число передали, или отрицательное; ");
        System.out.println("5 - Метод, которому в качестве параметра передается целое число, возвращает true, если число отрицательное;");
        System.out.println("6 - Метод определяет, является ли год високосным, и выводит сообщение в консоль");
    }

    private static void leapyear() {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа определяет, является ли введенный год високосным");
        System.out.print("Введите год: ");
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else System.out.println("Год НЕ високосный");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        hello();
        message();
        int m = in.nextInt();
        if(m == 1){
            Variables();
        } else if(m == 2){
            result();
        } else if(m == 3){
            summ();
        } else if(m == 4){
            positiveNumber();
        } else if(m == 5){
            negative();
        } else if(m == 6){
            leapyear();
        } else {
            System.out.println("Введено некорректное число...");
            message();
        }
    }
}
