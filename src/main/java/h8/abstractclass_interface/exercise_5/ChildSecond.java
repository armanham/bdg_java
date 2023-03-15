package h8.abstractclass_interface.exercise_5;

public class ChildSecond extends Parent{

    public int countOfBros(){
        return Parent.countOfChild - 1;
    }
}
