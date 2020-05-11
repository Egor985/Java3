package src.Lesson3.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String surname, String number){
        ArrayList<String> numList = phoneBook.get(surname);
        if (numList == null) numList = new ArrayList<>();
        numList.add(number);
        phoneBook.put(surname, numList);
    }

    public ArrayList<String> get(String surname){
        return phoneBook.get(surname);
    }

    public void info(){
        System.out.println(phoneBook);
    }
}
