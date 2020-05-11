package src.Lesson1.homework.runAndWall;

public class Participants {
    private static String name;
    private static int counter = 1;
    private static int i;
    private int Treadmill;
    private double Wall;
    public int runLimit;
    public double jumpLimit;
    public static int length;
    public double height;

    public int Treadmill(int length){
        this.length = length;
        return length;
    }

    public double Wall(double height){
        this.height = height;
        return height;
    }

    public Participants(){
        this.name = "Участник ";

        this.runLimit = (int)(Math.random() * 1000);
        System.out.println(runLimit);
        this.jumpLimit = (double) (Math.random() * 5);
        System.out.println(jumpLimit);

        if (runLimit >= Treadmill(750)){
            System.out.println(name + counter + " успешно пробежал расстояние");
        } else {
            System.out.println(name + counter + " не смог пробежать расстояние");
        };

        if (jumpLimit >= Wall(1.5)){
            System.out.println(name + counter + " успешно преодолел препятствие");
        } else {
            System.out.println(name + counter + " не смог преодолеть препятствие");
        };
        counter++;
    }

    public static void main(String[] args) {

        do {
            Participants participants = new Participants();
            i++;
        } while (i < 3);
    }
}
