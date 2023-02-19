import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner userInputObj = new Scanner(System.in);

        System.out.println("Enter the height of the rectangle:");
        double height = userInputObj.nextDouble();
        System.out.println("The height is " + height);

        System.out.println("Enter the width of the rectangle:");
        double width = userInputObj.nextDouble();
        System.out.println("The width is " + width);

        double perimeter = 2 * width + 2 * height;
        double area =  width * height;
        System.out.println("the perimeter of the rectangle is " + perimeter);
        System.out.println("the of the rectangle area is " + area);
    }
}
