public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;

        double circleDiameter = 2 * circleRadius;
        double circleCircumference = 2 * 3.14 * circleRadius;
        double circleArea = 3.14 * circleRadius * circleRadius;

        System.out.println("The circle diameter is " + circleDiameter);
        System.out.println("The circle circumference is " + circleCircumference);
        System.out.println("The circle area is " + circleArea);
    }
}
