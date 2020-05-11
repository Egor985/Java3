package classworc;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;  // проброс исключения
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class IfCase {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);  //ввод данных
        //int value = in.nextInt();  //возврат первого целого числа с консоли
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 2 вариант ввода данных
        //int a = System.in.read()  //3 вариант работы со вводом
        //int a = Integer.parseInt(br.readLine());  //метод преобразования строки в целое число
//определение находится ли задаваемая точка в пределах треугольника
        System.out.print("Введите катеты: а = ");
        double a = in.nextInt();
        System.out.print("b = ");
        double b = in.nextInt();
        System.out.println("Введите коорбинаты точки: х = ");
        double x = in.nextDouble();
        System.out.println("y = ");
        double y = in.nextDouble();
        if (x >= 0 && y >= 0 && y <= - (a / b) * x + a){
            System.out.println("Точка внутри треугольника");
        } else
            System.out.println("Точка за пределами треугольника");


 /*       switch (value){
            case 0:
                System.out.println("Ноль");  // гарантируется выполнение инструкций за одну ассемблерную команду
                break;
            case 1:
                System.out.println("Один");
                break;
            default:
                System.out.println("Другая цифра");
        }*/
    }
}
