package src.Lesson1.homework.obstacles;

public class Obstacles {
    private static String name;
    private static int counter = 1;
    private int Barrier;
    public double height;


    public double Barrier(String name, double height){
        this.name = name;
        this.height = height;
        return height;
    }

    public Obstacles(String name){
        this.name = name;
        counter++;
        System.out.println(name);
    }
    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Obstacles obstacle = new Obstacles("Прыгун " + counter);

        obstacle.Barrier("Вася", 2);
        System.out.println(obstacle);
    }

}
