package Lesson6.homework.Animal4;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Anna", 35);
        cat.takeBarrier(limit -> limit > 12);
        Barrier barrier = (arg) -> arg < 150;
        System.out.println(barrier.can(16));
    }
}
