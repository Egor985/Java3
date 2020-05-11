package classworc;

import java.util.Arrays;
import java.util.Random;

public class Mass{
    // Массивы
    static  void positiveSum(int[] array){
//        int pos = -1;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] > 0){
//                pos = i;
//            }
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//аналогично
        int sum = 0;
        for(int element : array){
            //System.out.print(element + " ");
            if(element > 0) sum += element;
        }
        System.out.println(sum);

//Стрим
        // .map(arg -> arg + 2)  - отмапил увеличил на 2
        // .filter(x -> x >= 0)   отфильтровал только положительные
//        System.out.println();
//        Arrays.stream(array)
//                .map(arg -> arg + 2)
//                .filter(x -> x >= 0)
//                .sorted()
//                .forEach(consumer -> System.out.print(consumer + " "));
    }

    //одномерный массив
    static int[] createArray( int len, int fillValue){
        int [] a = new int[len];  //создание массива длины
        Arrays.fill(a, fillValue);
//аналогично
//        for(int i = 0; i < a.length; i++) {
//            a[i] = fillValue;
//        }
            return a;
    }

//двумерный массив
    static int [][] deepArray(int len) {
        Random rnd = new Random();
        int [][] a = new int[len][];
        for (int i = 0; i < len; i++) {
            a[i] = new int[1 + rnd.nextInt(10)];
        }
        return a;
    }


//000    101
//000 -> 010
//000    101
    static void fillDiag(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
    }

    public static void main(String[] args) {
        //positiveSum(new int[]{1,2,3,-40,5,-60,7,8,9});

        //System.out.println(Arrays.toString(createArray(5, 7)));

        //System.out.println(Arrays.deepToString(deepArray(5)));

        int [][] m = new int[3][3];
        fillDiag(m);
        //System.out.println(Arrays.deepToString(m));  //[[1, 0, 1], [0, 1, 0], [1, 0, 1]]
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
