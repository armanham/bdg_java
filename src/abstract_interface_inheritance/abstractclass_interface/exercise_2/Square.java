package abstract_interface_inheritance.abstractclass_interface.exercise_2;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Draw square");
    }

    @Override
    public void erase() {
        System.out.println("Erase square");
    }
}
