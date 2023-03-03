package h8.abstractclass_interface.exercise_5;

public class Test {

    public static void main(String[] args) {
        Parent parent = new Parent(18);

        ChildFirst first = new ChildFirst();
        System.out.println(first.countOfBros());
        Parent.setCountOfChild(4);
        System.out.println(first.countOfBros());
    }
}
