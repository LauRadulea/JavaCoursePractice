import java.util.Scanner;
public class Ex2ArrayOddNo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int [] userArray = new int[10];

        System.out.println("please input a number:");
        for (int i = 0; i < userArray.length; i++){
            userArray[i] = userInput.nextInt();
        }
        System.out.println("The array is: ");
        for(int i:userArray)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("The odd values are: ");

        for(int i:userArray)
        {
            if( i % 2 != 0)
            System.out.print(i + " ");
        }
    }
}
