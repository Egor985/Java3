package src.Lesson3.homework;

public class Test {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        System.out.println("Телефонный справочник\n");
        phonebook.add("Кортелев", "+7-913-917-25-41");
        phonebook.add("Игнатьева", "+7-906-905-11-75");
        phonebook.add("Кортелев", "+7-923-24-64-888");
        phonebook.add("Низиенко", "+7-911-905-11-11");

        phonebook.info();

        System.out.println("Номер телефона Кортелев " + phonebook.get("Кортелев"));


    }
}
