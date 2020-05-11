package Lesson5;

import java.util.Arrays;

public class Test {
    static int a = 2;
    public static void main(String[] args) {
//        int a = 4;
//        a = 3;
//        System.out.println(Test.a);
//        new Test().a = 3;
        System.out.println();
        Cat cat = new Cat();  //создаем ссылку на класс
        //null.some NPE
        new Cat(); new Cat();
        System.out.println(new Cat().getCounter());
        Arrays.toString(new int[]{});
        cat.say();
        cat.setName("Vaska");
        //System.out.println(cat.age);
        //System.out.println(cat.name);
        System.out.println(cat.getName());
        for(int i = 0; i < 1000000; i++){
            new Cat();
        }
        System.out.println(new Cat().getCounter());
    }
}
