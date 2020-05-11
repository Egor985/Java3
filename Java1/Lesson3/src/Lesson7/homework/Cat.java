package Lesson7.homework;

public class Cat extends Plate{
    private static String name;
    private static int appetitite;
    private static boolean satiety;

    public Cat(String name, int appetitite){
        super(appetitite);
        this.name = name;
        this.appetitite = appetitite;
    }

    public String getName(){
        return name;
    }

    public int getAppetitite(){
        return appetitite;
    }

    public void eat(Plate plate){
        satiety = plate.decreaseFood(appetitite);
    }

    public void info(){
        System.out.println(name + " " + (satiety? " сыт" : " голоден"));
    }
}
