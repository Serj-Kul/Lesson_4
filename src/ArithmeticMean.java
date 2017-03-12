import java.util.Random;

/**
 * Created by Serj on 12.03.2017.
 */
public class ArithmeticMean {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }

        int sum = 0; // сумма

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
            sum = sum + myArray[i];
        }

        // среднее арифметическое
        System.out.println("\nArithmetic Mean = " + sum / myArray.length);
    }
}
