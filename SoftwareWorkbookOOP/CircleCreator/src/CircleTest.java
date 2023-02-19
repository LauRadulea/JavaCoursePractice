public class CircleTest {
    public static void main(String[] args) {
        CircleCreator Circle01 = new CircleCreator(1.0, "Red");
        CircleCreator Circle02 = new CircleCreator(4.5, "Green");
        CircleCreator Circle03 = new CircleCreator(3.2, "Blue");
        System.out.println("Radius: " + Circle01.getRadius() + ", Color: " + Circle01.getColor() + ", Area: " +
                Circle01.getArea() + ", Circumference: " + Circle01.getCircumference());
        System.out.println("Radius: " + Circle02.getRadius() + ", Color: " + Circle02.getColor() + ", Area: " +
                Circle02.getArea() + ", Circumference: " + Circle02.getCircumference());
        System.out.println("Radius: " + Circle03.getRadius() + ", Color: " + Circle03.getColor() + ", Area: " +
                Circle03.getArea() + ", Circumference: " + Circle03.getCircumference());
    }
}
