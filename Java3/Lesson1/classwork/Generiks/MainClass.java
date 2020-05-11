package Java3.Lesson1.classwork.Generiks;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

//Применение генериков
        // 1. Объекты (классы) хранения. Type safety - защищенность типов. - Коллекции
        // 2. Одинаковая обработка разных типов данных.
        // 3. Использование в методах работы с вопросом и ответом.
   /* private static <T, R> R sendRequest(T request) {
        R result = (R)sendMessage(request);
        return result;
    }*/

        BoxComp b1 = new BoxComp(10);
        BoxComp b2 = new BoxComp(10);
        System.out.println(b1.compareTo(b2));
// если возвращается 0 - объекты равны,
// если положительное число - b1>b2,
// если отрицательное число b1<b2 на величину возвращаемого числа
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Number> numberList = new ArrayList<>(Arrays.asList(10, 20, 30));
//    public static <T> void copy(List<? super T> dest, List<? extends T> src) {} ограничение сверху и снизу


            Collections.copy(numberList, integerList);// элемент, в который копируем - numberList,
        // элемент, из которого копируем(источник) -  integerList


        //processSimpleBoxes();
        //processGenericBoxes();
        //processWithTwoGens();
        //processBoxesWithAvg();
        //processNumberListAvg();
        //GenericMethod();

    }

    private static void GenericMethod() {
        //Обобщенный метод
        //из листа достаем первый элемент
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(10, 20, 30));
        Integer firstElement = getFirstListElement(integerList);
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3"));
        String firstStringElement = getFirstListElement(stringArrayList);
        System.out.println("First element of list is: " + getFirstListElement(integerList));
        System.out.println("First element of list is: " + getFirstListElement(stringArrayList));

    }

    private static <T> T getFirstListElement(List<T> list) {
        //<T> T - указание компилятору, что данный тип является обобщенны - тип, который должен возвращать метод,
        // используются генерики
        //<T extends Number> - тип, строго наследуемые от Number или являются Number
        if(list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);// возвращаем первый элемент
    }

    private static void processNumberListAvg() {
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println("List with ints avg = " + getNumberListAvg(integerList));

        //конструкция сырых типов
        //ArrayList rawList = new ArrayList<>();  //List хранит объекты ->
        // -> ArrayList<Object> rawList = new ArrayList<>();
    }

    private static double getNumberListAvg(ArrayList<? extends Number> numbers) {//? super Number - ограничение снизу -
        // можно передать только Number или его родителей
        double result = 0.0;
        for(Number number : numbers) {
            result += number.doubleValue();
        }
        return result / numbers.size();
    }


    private static void processBoxesWithAvg() {
        BoxWithNumbers<Integer> boxWithInts = new BoxWithNumbers<>(10, 20, 30);
        BoxWithNumbers<Integer> boxWithInts2 = new BoxWithNumbers<>(30, 20, 10);
        BoxWithNumbers<Float> boxWithFloats = new BoxWithNumbers<>(10f, 20f, 30f);

//        System.out.println("Avg for Ints = " + boxWithInts.avg());
//        System.out.println("Avg for Float = " + boxWithFloats.avg());
        System.out.println(boxWithInts.isSameBoxes(boxWithFloats));
//        float f1 = 1.0f;
//        float f2 = 0.0f;
//        for (int i = 0; i < 100; i++) {
//            f2 += 0.01f;
//        }
//        System.out.println(f1 == f2);
//        System.out.println(f1);
//        System.out.println(f2);
    }

    private static void processWithTwoGens() {
        BoxWithTwoGeneric<Integer, String> boxWithTwoGeneric1 = new BoxWithTwoGeneric<>(10, "Some string");

        int obj1Value = boxWithTwoGeneric1.getObj1();
        String obj2Value = boxWithTwoGeneric1.getObj2();

        System.out.println(boxWithTwoGeneric1);
    }

    private static void processGenericBoxes() {

        BoxGen<Integer> box1 = new BoxGen<>(10);
        BoxGen<Integer> box2 = new BoxGen<>(30);
        BoxGen<String> stringBoxGen = new BoxGen<>("Java");


        System.out.println(box1);
        System.out.println(box2);
        System.out.println(stringBoxGen);

        //box1.setObj("Java");

        int sum = box1.getObj() + box2.getObj();

        System.out.println(sum);
    }

    private static void processSimpleBoxes() {
        Box box1 = new Box(10);
        Box box2 = new Box(30);

        System.out.println(box1);
        System.out.println(box2);

        // ....
        // вызывает ClassCastExeption
        //box1.setObj("Java");
        //....

        if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
            int sum = (Integer) box1.getObj() + (Integer) box2.getObj();
            System.out.println(sum);
        } else {
            System.out.println("Box type ERROR");
        }
        // приложение может упасть если проверка не выполняется
    }
}
