package classworc;

public class Cycles {
    static void printNA(int n){
        int i = 0;
        while (i++ < n){
            System.out.println("A");
        }
        //аналогичны
        /*while (n-- > 0){
            System.out.println("A");
        }*/
    }

// степень числа 2
    static void printAllPow2(int limit){
        /*int first = 1, counter = 0;
        while (counter++ <= limit){
            System.out.print(first + " ");
            first *= 2;
        }
        System.out.println();*/
        //аналогичны
        for(int i = 0, f = 1; i <= limit; i++, f *=2){
            System.out.print(f + " ");
        }

   /*     System.out.println();  /обычный цикл for
        for(int i = 0, i < 10; i++){
            System.out.println(i + " ");
        }*/
    }

//()(())((())) = f(3), f(2)= ()(()), f(1)=() рекуррентсноть
    static void f(int n){
        int counter = 0;
        for (int i = 1; i <=n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("(");
            }
            for (int j = 0; j < i; j++){
                System.out.print(")");
            }
        }
    }

    //f1(7) = ()(())(
    static void f1(int limit){
        int counter = 0;
        boolean isRunning = true; // булеан флаг
        for (int i = 1; isRunning; i++){
            for (int j = 0; j < i; j++){
                System.out.print("(");
                counter++;
                if (counter == limit){
                    isRunning = false;  //закрытие в условии внешнего цикла по флагу
                    break;  //return - прерывает функцию, не нужен флаг isRunning
                }
            }
            for (int j = 0; isRunning && j < i; j++){
                System.out.print(")");
                counter++;
                if (counter == limit){
                    isRunning = false;  //закрытие в условии внешнего цикла по флагу
                    break;
                }
            }
        }
    }

    //таблица умножения
    static void multiplyTable(int x, int y) {
        for (int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++){
                System.out.printf("%3d", i * j);  //"%3d" - формат printf, определяющий 3 пространства под один символ вывода
            }
            System.out.println();  //переход на следующую строку
        }

    }

    // кредитный калькулятор
    static void calc(double sum, double percent, double pay){
        double startSum = sum, startPay = 0;
        int mounth = 1;
        System.out.println("Кредитный калькулятор");
        while (true){
            sum = sum * (1 + percent/100) - pay;
            startPay += pay;
            if(sum <= 0){
                System.out.println("Вы выплатили свой кредит за " + mounth/12 + " лет и " + mounth%12 + " месяцев");
                System.out.println("Вы переплатили " + (startPay - startSum) + " рублей!");
                return;
            }
            if(mounth > 600){
                System.out.println("Увы, Вам не удалось выплатить кредит - Вас больше нет в живых!");
                return;
            }
            mounth++;
        }
    }

    public static void main(String[] args) {
        //printNA(3);
        printAllPow2(10);
        //f(3);
        //f1(7);
        //multiplyTable(9, 9);
       // calc(1000000, 0.9, 10000);

    }
}
