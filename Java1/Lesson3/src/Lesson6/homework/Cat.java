package Lesson6.homework;

public class Cat extends Animal{
    private static String Name = "Мурзик ";
    private static int counter = 1;
   // private static int appetite;
   // private static boolean satiety;

    @Override
    public String toString() {
        return Name;
    }

    public Cat() {
        Name += counter;
        this.swimLimit = 0;
        this.runLimit = 200;
        this.jumpLimit = 2;
       // this.appetite = appetite;
    }

   /* public int getAppetite() {
        return appetite;
    }*/



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
        System.out.println(this + " не умеет плавать");
    }

    @Override
    public void jump(int height) {
        if (height <= jumpLimit) {
            System.out.println(this + " прыгает на высоту " + height + " метра(ов)");
        } else {
            System.out.println(this + " не может запрыгнуть на эту высоту");
        }
    }
}
