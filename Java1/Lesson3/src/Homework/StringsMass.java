package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringsMass {

    private static Random random = new Random();

    private static void number() {
        Scanner in = new Scanner(System.in);

        do {
            int answer = random.nextInt(10);
            System.out.println("Угадай число от 0 до 9 с 3 попыток");
            for (int i = 3; i > 0; i--){
                System.out.print("Введите число: ");
                int userAnswer = in.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляю, Вы угадали! ");
                    break;
                }
                System.out.println(userAnswer > answer ? "Вы ввели слишком большое число." : "Вы ввели слишком маленькое число. ");
                System.out.println((i-1) > 0 ? "Попробуйте еще раз, у Вас осталось " + (i-1) + " попыток" : "Вы проиграли! Правильный ответ: " + answer);
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        } while (in.nextInt() == 1);
    }

    public static void main(String[] args) {
        number();
    }
}
