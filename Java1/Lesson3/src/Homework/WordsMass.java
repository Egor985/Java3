package Homework;

import java.util.Random;
import java.util.Scanner;

public class WordsMass {

    private static Random random = new Random();

    public static void wordString() {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Отгадайте слово, загаданное компьютером");
        int massWord = random.nextInt(words.length - 1);
        String word = words[massWord];
        System.out.println(word);
        do {
            System.out.print("Введите свой вариант: ");
            String userAnswer = scanner.nextLine();
            char[] newWord = new char[0];
            char[] charsWord = word.toCharArray();
            for (int i = 0; i < 15; i++){
                if  (newWord[i] == charsWord[i]){
                    newWord[i] = newWord[i];
                } else newWord[i] = '#';

            }

//            if (word == userAnswer){
//                System.out.println("Поздравляю, Вы угадали! ");
//                break;
//            } else


        } while(true);
    }

    public static void main(String[] args) {
        wordString();
    }

}
