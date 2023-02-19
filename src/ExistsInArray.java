import java.util.Scanner;
public class ExistsInArray {
    public static void main(String[] args) {

        int  [] arrayOfNumbers = {10, 15, 34, 23, 45};
        boolean searchResult = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to search for in the array: ");
        int noSearchedFor = reader.nextInt();

        for (int number : arrayOfNumbers) {
            if (number == noSearchedFor)
                searchResult = true;
        }

        if(searchResult)
            System.out.println("Value " + noSearchedFor + " was found in the array.");
        else
            System.out.println("Value " + noSearchedFor + " was NOT found in the array.");
    }
}
