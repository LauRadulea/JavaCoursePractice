public class CoffeShop {
    public static void main(String[] args) {
        coffee("Cappucino", 4.5);
        coffee("Mocha", 3.5);
        coffee("Flat White", 4.0);
    }

    static void  coffee(String coffeeType, double price) {
        System.out.println("You ordered: " + coffeeType + " which costs " + price);
    }
}
