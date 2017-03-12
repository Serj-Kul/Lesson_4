import java.util.Random;

/**
 * Created by Serj on 12.03.2017.
 */
public class MinMax {
    public static void main(String[] args) {



        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }

        int max = myArray[0];
        int min = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
            if (max < myArray[i]) {
                max = myArray[i];
            } else if (min > myArray[i]){
                min = myArray[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
