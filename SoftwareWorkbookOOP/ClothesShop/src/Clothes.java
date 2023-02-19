public class Clothes {
    private String category;
    private String color;
    private double price;
    private int stockleft;

    public Clothes(String category, String color, double price, int stockleft) {
        this.category = category;
        this.color = color;
        this.price = price;
        this.stockleft = stockleft;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getStockleft() {
        return stockleft;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockleft(int stockleft) {
        this.stockleft = stockleft;
    }

    public void updatePrice(double discount) {
        this.price -= (this.price * discount) / 100;
    }

    public void updateStock(int itemsSold) {
        this.stockleft -= itemsSold;
    }
}
