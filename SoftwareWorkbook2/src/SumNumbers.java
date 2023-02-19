import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        //initialise sumTotal =0
        int sumTotal=0;
        //ask user to enter a number, save this number to variable sumTo
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum to: ");
        int SumTo = reader.nextInt();
        //use while loop to calculate the sumTotal
        int no = 1;
        while( no <= SumTo) {
            sumTotal = sumTotal + no; // sumTotal += no;
            no++;
        }
        //print the result
        System.out.print("Sum of all the positive integers to "+SumTo+" = "+sumTotal);
    }
}
