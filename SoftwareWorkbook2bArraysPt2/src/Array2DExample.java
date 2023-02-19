public class Array2DExample {
    public static void main(String[] args) {
        int [] prices = {12000, 34000, 56000, 15450, 45000};

        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + "  ");
        }

        prices[0] = 12670;
        System.out.println();

        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + "  ");
        }
    }
}
