public class NumberMethodOverloading {
    static int sumNum(int x, int y) {
        return x+y;
    }

    static double sumNum(double x, double y) {
        return x+y;
    }

    public static void main(String[] args) {
        // print here, not on the method
        System.out.println(sumNum(42, 64)); // pass on int numbers
        System.out.println(sumNum (125, 869));
        System.out.println(sumNum(120.4 , 354.6)); // pass on decimal number
        System.out.println(sumNum(920.5, 746.5));

        int sumIntNum = sumNum(23,7);
        System.out.println(sumIntNum);
    }
}
