import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int diceNumber = randomGenerator.nextInt(6) + 1;
        int crazyDice = randomGenerator.nextInt(10) + 1;

        System.out.println("The dice number is " + diceNumber + " and the crazy dice is " + crazyDice);
    }
}
