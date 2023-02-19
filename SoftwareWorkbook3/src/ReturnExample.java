public class ReturnExample {
    static int myCalculator(int x) {
        return 5+x;
    }

    public static void main(String[] args) {
        int newNumber = myCalculator(4);
        System.out.println("the new number: " + newNumber + " or method call result directly: " + myCalculator(4));
    }
}
