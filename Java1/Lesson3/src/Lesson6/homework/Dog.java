package Lesson6.homework;

public class Dog extends Animal{
    private static String Name = "Шарик";
    private static int counter = 1;

    @Override
    public String toString() {
        return Name;
    }

    public Dog() {
        Name += counter;
        this.swimLimit = 10;
        this.runLimit = 500;
        this.jumpLimit = 0.5;
    }

    @Override
    public void run(int length) {
        if (length <= runLimit) {
            System.out.println(this + " бежит " + length + " метра(ов)");
        } else {
            System.out.println(this + " не может пробежать столько");
        }
    }
    @Override
    public void swim(int length) {
        if (length <= runLimit) {
            System.out.println(this + " проплывает " + length + " метра(ов)");
        } else {
            System.out.println(this + " не может проплыть столько");
        }    }

    @Override
    public void jump(int height) {
        if (height <= jumpLimit) {
            System.out.println(this + " прыгает на высоту " + height + " метра(ов)");
        } else {
            System.out.println(this + " не может запрыгнуть на эту высоту");
        }
    }

}
