package Java3.Lesson1.classwork.Generiks;

public class BoxGen <T>{  // конструкция - генерик, класс - обобщенный, тип - обобщенный

        private T obj;  // обобщенная защищенная коробка

    public BoxGen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "BoxGen{" +
                "type=" + obj.getClass().getSimpleName() +
                ", obj=" + obj +
                '}';
    }

}
