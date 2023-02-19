public class Menu {
    String dishName;
    String descriptionIngredients;
    double price;

    public Menu(String name, String description, double inputPrice) {
        dishName = name;
        descriptionIngredients = description;
        price = inputPrice;
    }

    public Menu() {
        dishName = "Leek soup";
        descriptionIngredients = "leek and other tasty veggies";
        price = 5;
    }

    public static void main(String[] args) {
        Menu option1 = new Menu("Spaghetti bolognese", "Spaghetti with tomato souce and beef mince", 10.5);
        System.out.println("Option 1: " + option1.dishName + " containing " + option1.descriptionIngredients + " at the cost of £" + option1.price);

        Menu option2 = new Menu("Spaghetti carbonara", "Spaghetti with white souce", 10);
        System.out.println("Option 2: " + option2.dishName + " containing " + option2.descriptionIngredients + " at the cost of £" + option2.price);

        Menu option3 = new Menu();
        System.out.println("Option 3: " + option3.dishName + " containing " + option3.descriptionIngredients + " at the cost of £" + option3.price);

        Menu option4 = new Menu("Stake", "beef stake and as a side boiled patatoes with special spices", 15);
        System.out.println("Option 4: " + option4.dishName + " containing " + option4.descriptionIngredients + " at the cost of £" + option4.price);

    }

}
