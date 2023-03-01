package abstract_interface_inheritance.abstractclass_interface.exercise_2;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void erase() {
        System.out.println("Erase circle");
    }
}
