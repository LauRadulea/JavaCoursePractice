public class Main {

    int x;
    int y;

    public Main() {
        x = 5;
        y = 13;
    }

    public Main(int n1, int n2) {
        x = n1;
        y = n2;
    }

    public static void main(String[] args) {

        Main num1 = new Main();
        Main num2 = new Main(1, 5);
        System.out.println(num1.x);
        System.out.println(num1.y);
        System.out.println(num2.x);
        System.out.println(num2.y);
    }
}