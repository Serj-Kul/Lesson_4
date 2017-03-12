import java.util.Random;

/**
 * Created by Serj on 12.03.2017.
 */
public class FindIndex {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];

        System.out.println("myArray.length = " + myArray.length); // длина массива

        // заполнение и вывод массива
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");
        }

        int N = 82; // что ищем
        int indexFront; // индекс с начала
        int indexBack; // индекс с конца

        // Встречается с начала
        for (int i = 0; i < myArray.length; i++) {
            if (N == myArray[i]) {
                indexFront = i;
                System.out.println();
                System.out.println("indexFront = " + indexFront);
            }
        }

        // Встречается с конца
        /* Если в условии имелся в виду индекс одного и того же числа, то
         * второй проход не нужен и индекс с конца будет равен разнице длинны
         * массива и индекса с начала => indexBack = myArray.length - indexFront;
         * Вроде правильно изложил мысль)
         */
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (N == myArray[i]) {
                indexBack = i;
                System.out.println("indexBack = " + indexBack);
                System.exit(0);
            }
        }

        System.out.println();
        System.out.println("-1");
    }
}
