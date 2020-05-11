package Lesson6.classwork.construction;

public class B extends A {
    protected int b;
    public B(int a, int b){
        super(a);

        System.out.println("B created! for " + this);
    }
}
