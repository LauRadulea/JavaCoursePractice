import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int [] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator.nextInt(10) + 1;
            System.out.print(myArray[i] + " ");
        }
        int max = myArray[0], min = max;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max)
                max = myArray[i];

            if (myArray[i] < min)
                min = myArray[i];
        }
        System.out.println();
        System.out.println("Minimum found is " + min);
        System.out.println("Maximum found is " + max);
    }
}
