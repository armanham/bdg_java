package h9_enum.exercise_6;

public class Test {

    public static void main(String[] args) {
        ShapeType shapeType = ShapeType.SQUARE;
        Square shape = new Square(2);
        shapeType.setShape(shape);

    }
}
