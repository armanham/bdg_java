package h3.class_object;

//Սահմանել Rectangle class :  fields (length, width ),
//methods ( calculateArea())
public class Rectangle {

    private double weight;

    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateArea() {
        return weight * height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
