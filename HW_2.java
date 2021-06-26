package HomeWork_2;
import java.sql.Array;
import java.util.Scanner;
import java.util.Random;
public class HW_2 {

    public static void main(String[] args) {

        Task_6();


    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void Task_1() {
        int array[] = new int[10];
        int count = 0;
        Random rand = new Random();
        for (count = 0; count < array.length; count++) {
            array[count] = rand.nextInt(2);
            System.out.print(array[count] + ", ");
        }
        System.out.println();
        for (count = 0; count < array.length; count++) {
            if (array[count] == 1) {
                array[count] = 0;
            } else {
                array[count] = 1;
            }
            System.out.print(array[count] + ", ");
        }
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void Task_2() {
        int array[] = new int[8];
        int count, val = 0;
        for (count = 0; count < array.length; count++) {
            array[count] = val;
            val = val + 3;
            System.out.print(array[count] + ", ");
        }

    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void Task_3() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int count = 0;
        for (count = 0; count < array.length; count++) {
            if (array[count] < 6) {
                array[count] = array[count] * 2;
            }
            System.out.print(array[count] + ", ");
        }
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void Task_4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите разрядность массива: ");
        int a = in.nextInt();
        int array[][] = new int[a][a];
        int count, count2, diag, diag2 = 0;
        Random rand = new Random();
        for (count = 0; count < array.length; count++) {

            for (count2 = 0; count2 < array[count].length; count2++) {
                array[count][count2] = rand.nextInt(30);
                System.out.print(array[count][count2] + ", ");
            }
            System.out.println();
        }
        for (diag = 0; diag < array.length; diag++, diag2++) {


            array[diag][diag2] = 1;
            array[diag][(array[diag].length - 1) - diag2] = 1;


        }
        for (count = 0; count < array.length; count++) {

            for (count2 = 0; count2 < array[count].length; count2++) {

                System.out.print(array[count][count2] + ", ");
            }
            System.out.println();
        }
    }

    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void Task_5() {
        int array[] = new int[10];
        int counter, max = 0, itog = 0;
        Random rand = new Random();
        for (counter = 0; counter < array.length - 1; counter++) {
            array[counter] = rand.nextInt(30);
            System.out.print(array[counter] + ", ");
        }
        for (counter = 0; counter < array.length - 1; counter++) {

            if (max < array[counter]) {
                max = array[counter];
                itog = max;
            }

        }
        System.out.print("Максимальное значение: " + itog);
    }

    //** Написать метод, в который передается не пустой одномерный целочисленный массив, метод
    // должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    public static boolean Task_6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите разрядность массива: ");
        boolean bul = false;
        int a = in.nextInt();
        int array[] = new int[a];
        Random rand = new Random();
        int counter, counter2, summleft = 0, summright = 0;

        for (counter = 0; counter < array.length; counter++) {
            array[counter] = rand.nextInt(2);
            System.out.print(array[counter] + ", ");
        }
        for (counter = 0; counter < array.length - 1; ++counter) {
            summleft = summleft + array[counter];
            summright = 0;
            for (counter2 = counter + 1; counter2 < array.length; counter2++) {
                summright = summright + array[counter2];
            }
            if (summleft == summright) {
                System.out.print("Балланс достигнут на элементе массива № " + counter + " ");
                bul = true;
            } else {
                bul = false;
            }
        }
        return bul;
    }

    //**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
    // нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    //public static void Task_7() {
    //   Scanner in = new Scanner(System.in);
    //   System.out.print("Введите количество знаков смещения: ");
    //    int a = in.nextInt();
    //    int array[] = new int[10];
    //    Random rand = new Random();
    //   int counter, counter2, phase, sdvig = 0;
    //   System.out.print("Исходный массив ");
    //   for (counter = 0; counter < array.length; counter++) {
    //       array[counter] = rand.nextInt(10);
    //       System.out.print(array[counter] + ", ");
    //   }
    //    System.out.println();
    //    System.out.print("Обработанный масив: ");
    //   for (counter = array.length-1; counter == ((array.length-1) - a); counter--) {
    //       phase = array[counter];
    //       for (counter2 = 0; counter2 < a; counter2++) {
    //            sdvig = array[counter2];
    //           array[counter2] = phase;
    //            array[counter2 + 1] = sdvig;
    //            System.out.print(array[counter] + ", ");
    //       }
    //    }
//
    //    for (counter = 0; counter < array.length; counter++) {
//
    //      System.out.print(array[counter] + ", ");}
    //   System.out.println();
    //}
}

//