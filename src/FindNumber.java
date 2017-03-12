// Число встречающееся один раз в массиве

/**
 * Created by Serj on 12.03.2017.
 */
public class FindNumber {
    public static void main(String[] args) {

        int[] myArray = new int[]{3, 4, 2, 5, 9, 1, 2, 3, 4, 9, 5};
        int N = myArray[0]; // искомое число

        for (int i = 1; i < myArray.length; i++) {
            N ^= myArray[i];
        }
        System.out.println("N = " + N);
    }
}
