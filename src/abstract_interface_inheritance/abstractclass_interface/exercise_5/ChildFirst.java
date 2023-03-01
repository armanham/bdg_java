package abstract_interface_inheritance.abstractclass_interface.exercise_5;

public class ChildFirst extends Parent{

    public int countOfBros(){
        return Parent.countOfChild - 1;
    }

    public int parentAge(){
        return super.getAge();
    }
}
