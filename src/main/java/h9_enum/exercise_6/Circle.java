package h9_enum.exercise_6;

public class Circle extends Shape {

    private double radius;

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
