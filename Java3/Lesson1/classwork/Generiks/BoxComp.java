package Java3.Lesson1.classwork.Generiks;

public class BoxComp implements Comparable<BoxComp> {
//коробка использует интерфейс Comparable и возвращает какой-то тип
    private int size;

    public BoxComp(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(BoxComp another) {
        return this.size - another.size;    }

// аналогично
//    @Override
//    public int compareTo(Object o) {
//        if(!(o instanceof BoxComp)) {
//            throw new RuntimeException("Invalid box type: " + o.getClass().getSimpleName());
//        }
//        BoxComp another = (BoxComp)o;
//        return this.size - another.size;
//    }
}
