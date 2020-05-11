package Lesson7.homework;

public class Test {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Мурзик", 39),
                new Cat("Васька", 26),
                new Cat("Лекс", 41),
        };
        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
