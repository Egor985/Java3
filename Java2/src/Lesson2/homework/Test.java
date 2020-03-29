package src.Lesson2.homework;

public class Test {
    public static void main(String[] args) {
        Object[][] array;
        int sum = 0;
        try {
            array = initArray(4,4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += (int) array[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "],[" + j + "] находится значение, не пренадлежащее типу int." );
                }
            }
        System.out.println("Сумма массива = " + sum);
    }

    public static Object[][] initArray(int row, int col) throws MyArraySizeException {
        if (row != 4 || col != 4) {
            throw new MyArraySizeException("Размер массива 4х4 не может быть изменен");
        }
        return new Object[][]{{1,2,3,4},{5,6,7,8},{9,0,10,11},{12,13,14,15}};
    }
}
