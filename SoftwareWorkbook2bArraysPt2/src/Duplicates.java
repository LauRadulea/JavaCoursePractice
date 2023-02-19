import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomGenerator.nextInt(20) + 1;
            array2[i] = randomGenerator.nextInt(20) + 1;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < array1.length; i++) {
            for ( int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j])
                    System.out.print(array1[i] + "  ");
            }
        }
    }
}
