package h8.abstractclass_interface.exercise_5;

public class Parent {

    public static int countOfChild;

    private int age;

    static {
        countOfChild = 3;
        countOfChild = 8;
    }

    public Parent() {
    }

    public Parent(int age) {
        this.age = age;
    }

    public static int getCountOfChild() {
        return countOfChild;
    }

    public static void setCountOfChild(int countOfChild) {
        Parent.countOfChild = countOfChild;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
