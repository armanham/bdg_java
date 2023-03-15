package h8.abstractclass_interface.exercise_2;

public class Test {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        circle.draw();
        circle.erase();
        triangle.draw();
        triangle.erase();
        square.draw();
        square.erase();
    }
}
