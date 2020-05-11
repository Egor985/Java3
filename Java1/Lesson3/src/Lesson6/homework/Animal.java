package Lesson6.homework;

abstract class Animal {

    protected int swimLimit;
    protected int runLimit;
    protected double jumpLimit;
    //protected Object appetite;

    public abstract void run(int length);

    public abstract void swim(int length);

    public abstract void jump(int height);
}
