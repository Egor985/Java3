package Lesson6.homework.Animal3;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        setLimits(200, 0, 2);
    }

    @Override
    public void jump(int value) {
        if (value < getJumpLimit()) {
            System.out.println(getName() +
                    " прыгнул на " + value + " m");
        } else {
            throw new MoveError("cannot jump so high");
        }
    }

    @Override
    public void run(int value) {
        if (value < getRunLimit()) {
            System.out.println(getName() +
                    " пробежал " + value + " m");
        } else {
            throw new MoveError("cannot run so long");
        }
    }

    @Override
    public void swim(int value) {
        throw new MoveError("Cat's dont't swim!!!");
    }
}
