import java.util.Scanner;

public class MinMaxBetwen3Num {
    public static void main(String[] args) {
        Scanner readUserInput = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double n1 = readUserInput.nextDouble();
        double n2 = readUserInput.nextDouble();
        double n3 = readUserInput.nextDouble();

        if((n1 % 1 == 0) && (n2 % 1 == 0) && (n3 % 1 == 0)){
            System.out.println("the minimum of the three is: " + minim((int)n1, (int)n2, (int)n3) );
            System.out.println("the maximum of the three is: " + maxim((int)n1, (int)n2, (int)n3) );
        }
        else {
            System.out.println("the minimum of the three is: " + minim(n1, n2, n3) );
            System.out.println("the maximum of the three is: " + maxim(n1, n2, n3) );
        }

        System.out.println("them multiplied is:  " + multiplication(n1, n2, n3));
    }

    static int minim(int x, int y, int z) {
        if(x < y && x < z)
            return x;
        else if (y < x && y < z)
            return y;
        else
            return z;
    }

    static int maxim(int x, int y, int z) {
        if(x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }

    static double minim(double x, double y, double z) {
        if(x < y && x < z)
            return x;
        else if (y < x && y < z)
            return y;
        else
            return z;
    }

    static double maxim(double x, double y, double z) {
        if(x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }

    static double multiplication(double x, double y, double z){
        return x * z * y;
    }
}
