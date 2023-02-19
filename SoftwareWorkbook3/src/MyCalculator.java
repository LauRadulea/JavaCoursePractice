import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        Scanner readUserInput = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = readUserInput.nextInt();
        int num2 = readUserInput.nextInt();

        int additionResult = plus(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + additionResult);
        int substarction = minus(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + substarction);
        int multiplication = multipli(num1, num2);
        System.out.println(num1 + " x " + num2 + " = " + multiplication);
        int division = division(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + division);
    }
    static int plus(int x, int y){
        return x + y;
    }
    static int minus(int x, int y){
        return x - y;
    }
    static int multipli(int x, int y){
        return x * y;
    }
    static int division(int x, int y){
        return x / y;
    }
}
