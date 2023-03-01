package abstract_interface_inheritance.abstractclass_interface.exercise_8;

public class SubClass extends AbstractClass {

    public SubClass() {
        System.out.println("SubClass constructor");
    }

    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }
}
