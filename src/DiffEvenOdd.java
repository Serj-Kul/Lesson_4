import java.util.Random;

/**
 * Created by Serj on 12.03.2017.
 */
public class DiffEvenOdd {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }

        int EvenSumm = 0; // cумма четных
        int OddSumm = 0; // сумма нечетных

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
            if ((myArray[i] % 2) == 0) {
                EvenSumm = EvenSumm + myArray[i];
            } else {
                OddSumm = OddSumm + myArray[i];
            }
        }
        System.out.println();
        System.out.println("EvenSumm = " + EvenSumm);
        System.out.println("OddSumm = " + OddSumm);
        // разность сумм четных и нечетных
        System.out.println("Diff = " + (EvenSumm - OddSumm));
    }
}
