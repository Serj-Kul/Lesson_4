import java.util.Random;

/**
 * Created by Serj on 12.03.2017.
 */
public class SeqNum {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];

        System.out.println("myArray.length = " + myArray.length); // длина массива

        // заполнение и вывод массива
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");
        }
    }
}
