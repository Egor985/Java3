package Lesson6.classwork.construction;

public class C extends B {

    public C(int a, int b){
        super(a, b);
        System.out.println("C created! for " + this);
    }

    void foo(){
        System.out.println(a + b);
    }
}
