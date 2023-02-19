import java.util.Scanner;

public class ReaderInput {
    public static void main(String[] args) {
        //This program takes user input
        Scanner userInputObj = new Scanner(System.in);
        System.out.println("Enter user name:");
        String userName = userInputObj.nextLine(); //user inputs its the user name
        System.out.println("Your user name is " + userName);

        System.out.println("Enter user password:");
        String password = userInputObj.nextLine();
        System.out.println("Your user password is " + password);
    }
}
