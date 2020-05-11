package lesson7.src.animal;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Anna", 35);
        cat.takeBarrier(limit -> limit < 12);



//        Barrier barrier = (arg) -> arg < 150;
//        System.out.println(barrier.can(16));
    }
}
