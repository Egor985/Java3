package homework;

import java.util.Arrays;


public class homework {

    public static int[] mirror(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 1) % 2;
        }
        return arr;
    }

    public static int[] emptyArray(int lenth) {
        int[] array = new int[lenth];
        for (int i = 1; i < lenth; i++) {
            array[i] = array[i - 1] + 3;
        }
        return array;
    }

    public static int[] doubling(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 6){
                array2[i] = array2[i] * 2;
            } else{
                array2[i] = array2[i];
            }
        }
        return array2;
    }

    //0 0 1 0 0
    //0 1 1 1 0
    //1 1 1 1 1
    //0 1 1 1 0
    //0 0 1 0 0
    static void rhombus(int [][] matrix) {
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 1;
            }
        }
        matrix[0][2] = 1;
        matrix[4][2] = 1;
        matrix[2][0] = 1;
        matrix[2][4] = 1;
    }

    // Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static int Min(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    public static int Max(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > max) max = array[i];
        }
        return max;
    }

//сместить все элементы массива на n позиций
    public static void shiftLR(int[] array, int shift) {
        if (shift < 0) {
            shift = -shift;
            shift %= array.length;
            shift = array.length - shift;
        } else {
            shift = shift % array.length;
        }

        while (shift > 0) {
            int tmp = array[array.length - 1];
            for (int i = array.length - 1; i >= 1; i--) {
                array[i] = array[i - 1];
            }
            array[0] = tmp;
            shift--;
        }

        if (shift > 0) {
            shift = shift;
            shift %= array.length;
            shift = array.length + shift;
        } else {
            shift = shift % array.length;
        }

        while (shift > 0) {
            int tmp = array[array.length + 1];
            for (int i = array.length + 1; i >= 1; i--) {
                array[i] = array[i + 1];
            }
            array[0] = tmp;
            shift++;
        }
    }

    //Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int [] array) {

        int fullSum = 0, leftSum = 0;
        for (int i : array) {
            fullSum += i;
        }
        for (int i : array) {
            leftSum += i;
            if (2 * leftSum == fullSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mirror(new int []{1, 1, 0, 0, 1, 0, 1, 1, 0, 0})));

//        System.out.println(Arrays.toString(emptyArray(8)));

//        System.out.println(Arrays.toString(doubling(new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));

//        int [][] m = new int[5][5];
//        rhombus(m);
//        //System.out.println(Arrays.deepToString(m));  //[[1, 0, 1], [0, 1, 0], [1, 0, 1]]
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.print("Минимальное значение элементов массива: ");
//        System.out.println(Min(new int[]{-12, 16, 5, 0, -8, 11, 13, 1}));
//        System.out.print("Минимальное значение элементов массива: ");
//        System.out.println(Max(new int[]{-12, 16, 5, 0, -8, 11, 13, 1}));
//
//        int[] array = new int[]{1, 2, 3, 4, 5, 6};
//        shiftLR(array, 0);
//        System.out.println(Arrays.toString(array));

    }

}
