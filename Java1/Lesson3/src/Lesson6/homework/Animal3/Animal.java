package Lesson6.homework.Animal3;

public abstract class Animal {

    private String name;
    private int runLimit, swimLimit, jumpLimit;

    public Animal(String name) {
        this.name = name;
    }

    public void setLimits(int runLimit, int swimLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public String getName() {
        return name;
    }

    public abstract void jump(int value);
    public abstract void run(int value);
    public abstract void swim(int value);
}
