import java.util.Random;

/**
 * Created by Serj on 12.03.2017.
 */
public class MaxMult {
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
        int max_j = 1; // второй индекс с максимальным значением
        int maxMult = myArray[max_i] * myArray[max_j];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < myArray.length; j++) {
                // Вот такое сложное условие)))
                // условие (i != j), чтобы в них не попало одно и то же
                // максимальное число
                if ((maxMult < myArray[i] * myArray[j]) && (i != j)) {
                    maxMult = myArray[i] * myArray[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println();
        System.out.println("myArray[max_i] = " + myArray[max_i]);
        System.out.println("myArray[max_j] = " + myArray[max_j]);
        System.out.println("maxMult = " + maxMult);
    }
}
