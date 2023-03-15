package h9_enum.exercise_6;

public class Rectangle extends Shape {

    private double height;
    private double weight;

    @Override
    double getPerimeter() {
        return 2 * (height + weight);
    }

    @Override
    double getArea() {
        return height * weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
