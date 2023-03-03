package h8.inheritance.exercise_2;

public class SubClass extends SuperClass {

    public SubClass() {
        System.out.println(super.message);
        System.out.println(this.message);
    }

    private String message = "Hello SubClass class";

}
