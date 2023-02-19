public class CircleCreator {
    private double radius;
    private String color;
    private double area;

    private double circumference;

    public CircleCreator(double radius, String color) {
        setRadius(radius);
        setColor(color);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        area = Math.PI * this.radius * this.radius;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        circumference = Math.PI * this.radius * 2;
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

}
