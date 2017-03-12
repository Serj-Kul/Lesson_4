// Наибольшая разница элементов массива

import java.util.Random;

/**
 * Created by Serj on 12.03.2017.
 */
public class MaxDiff {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];

        System.out.println("myArray.length = " + myArray.length); // длина массива

        // заполнение и вывод массива
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");
        }

        int max_i = 0; // индекс с максимальным значением
        int min_j = 1; // индекс с минимальным значением
        int maxDiff = myArray[max_i] - myArray[min_j];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < myArray.length; j++) {
                if ((maxDiff < myArray[i] - myArray[j]) && (i != j)) {
                    maxDiff = myArray[i] - myArray[j];
                    max_i = i;
                    min_j = j;
                }
            }
        }
        System.out.println();
        System.out.println("myArray[max_i] = " + myArray[max_i]); // максимальное значение
        System.out.println("myArray[min_j] = " + myArray[min_j]); // минимальное значение
        System.out.println("maxDiff = " + maxDiff);
    }
}
