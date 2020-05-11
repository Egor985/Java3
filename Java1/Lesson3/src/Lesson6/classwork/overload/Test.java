package Lesson6.classwork.overload;

import Lesson6.classwork.construction.A;
import Lesson6.classwork.construction.C;

import java.util.ArrayList;

public class Test extends A {

    //инкапсуляция - сокрытие данных объектом
    //полиморфизм - свойство функции
    //наследование - перенимаем все свойство классов (private тоже, только не имеем к ним доступ без get-теров set-теров) - extends

    public Test(int a) {
        super(a);
    }

    void foo(int arg) {
        System.out.println("Function with INT arg");
    }

//    static void foo
//    (float arg) {
//        System.out.println("Function with FLOAT arg");
//    }

    void foo(double arg) {
        System.out.println("Function with DOUBLE arg = " + arg);
    }

    void foo(long arg) {
        System.out.println("Function with LONG arg = " + arg);
    }


    public static void main(String[] args) {

//        Test<String> test = new Test<String>();
//        test.add("lol");
//        test.foo(1.4);
    C c = new C(2, 5);


    }
}
