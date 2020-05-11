package src.Lesson3.homework;

import java.util.Arrays;
import java.util.HashMap;

public class wordsMass {
    public static void main(String[] args) {

        String[] words = {"в", "недрах", "тундры", "выдры", "в", "гетрах",
               "тырят", "в", "ведра", "ядра", "кедра",
               "выдрав", "с", "выдры", "в", "тундре", "гетры",
               "вытру", "выдрой", "ядра", "кедра",
               "вытру", "гетрой", "выдре", "морду",
               "ядра", "в", "вёдра", "выдру", "в", "тундру"};

        HashMap<String, Integer> unique = new HashMap<>();
        for(String word: words) {
            Integer result = unique.get(word);
            unique.put(word, result == null ? 1 : result + 1);
        }
        System.out.println("Исходный массив: " + Arrays.toString(words));
        System.out.println("Уникальные слова и количество повторений: " + unique);

    }
}
