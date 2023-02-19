import javax.security.auth.login.AccountLockedException;

public class Main {
    public static void main(String[] args) {
        Clothes item1 = new Clothes("top", "black",10.0, 100);
        Clothes item2 = new Clothes("trousers", "navy", 12.0, 50);
        Clothes item3 = new Clothes("dress", "rose", 45.0, 20);

        System.out.println("Item 1: Category - " + item1.getCategory() + ", price - " + item1.getPrice() + ", stock left: " + item1.getStockleft());

        item1.updatePrice(10);
        item1.updateStock(2);

        System.out.println("Item 1 Updated: Category - " + item1.getCategory() + ", price - " + item1.getPrice() + ", stock left: " + item1.getStockleft());

    }
}