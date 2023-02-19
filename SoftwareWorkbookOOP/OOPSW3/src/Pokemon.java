public class Pokemon {
    //list of attributes
    String type;
    int age;
    int health;

    public Pokemon() {
        type = "Pikachu";
        age = 5;
        health = 10;
    }

    public static void main(String[] args) {
        Pokemon obj = new Pokemon();
        System.out.println("The first pokemon is " + obj.type + ", age: " + obj.age + "");
    }
}
