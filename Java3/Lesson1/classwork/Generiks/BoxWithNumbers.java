package Java3.Lesson1.classwork.Generiks;

public class BoxWithNumbers <N extends Number>{

    private N[] numbers;

    public BoxWithNumbers(N... numbers) {  // N... - передает в метод неограниченное число параметров
        this.numbers = numbers;
    }

    public double avg() {
        double result = 0.0;
        for (int i = 0; i < this.numbers.length; i++) {
            result += this.numbers[i].doubleValue();  //обертка числа в значение double
        }
        return result / this.numbers.length;
    }

    public boolean isSameBoxes(BoxWithNumbers<?> another) { //BoxWithNumbers<?> = BoxWithNumbers<N extends Number> -
// wild card - допустим не только обобщенный элемент генерика из основного класса, но и любой другой, пр. int & float

        //return this.avg() == another.avg();  // погрешность в массовых вычислениях для чисел с плавающей запятой
        return Math.abs(this.avg() - another.avg()) < 0.0001;//значения сравниваемых элементов равны (сравниваемы по модулю abs)
    }
}
