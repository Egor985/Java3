package Java3.Lesson1.classwork.Generiks;

public class Box {
    private Object obj;

    public Box(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "type=" + obj.getClass().getSimpleName() +
                ", obj=" + obj +
                '}';
    }
}
