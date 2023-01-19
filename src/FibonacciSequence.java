import java.math.BigInteger;
public class FibonacciSequence {
    public static void main(String[] args) {
    fibonacciSequence(50);
    }

    static void fibonacciSequence ( int counter) {
        BigInteger fibPrevious0 = BigInteger.ZERO;
        BigInteger fibPrevious1 = BigInteger.ONE;
        BigInteger fibCurrent = BigInteger.ZERO;

        System.out.println(fibPrevious0);
        System.out.println(fibPrevious1);

        for(int i  = 1; i < counter-1; i++){
            fibCurrent = fibPrevious0.add(fibPrevious1);
            System.out.println(fibCurrent);
            fibPrevious0 = fibPrevious1;
            fibPrevious1 = fibCurrent;
        }
    }
}