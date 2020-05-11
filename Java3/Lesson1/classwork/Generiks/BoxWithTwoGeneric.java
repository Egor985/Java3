package Java3.Lesson1.classwork.Generiks;

public class BoxWithTwoGeneric<T, K> {
    //Типы генериков используют для удобства написания - "синтаксический сахар"
    // переменные типы
    // T - Type
    // K - Key
    // V - Value
    // E - Element
    // N - Number

    private T obj1;
    private K obj2;
    //private T[] arr;

    //Нельзя создавать обобщение исключений
    //Ограничение
    //Ошибка. Неизвестный тип.
    //private static T val = 10;

    public BoxWithTwoGeneric(T obj1, K obj2/*, T[] arr*/) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
        //Ограничение
        //Ошибка. Незвестно кол-во элементов контруктора
        //T value = new T();

        //Ограничение
        //Ошибка. Нельзя создавать массивы
        //T[] arr = new T[20];
    }

    public K getObj2() {
        return obj2;
    }

    @Override
    public String toString() {
        return "BoxWithTwoGeneric{" +
                "obj1 type = " + obj1.getClass().getSimpleName() +
                ", obj2 type = " + obj2.getClass().getSimpleName() +
                ", obj1 = " + obj1 +
                ", obj2 = " + obj2 +
                '}';
    }
}
