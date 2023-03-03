package h8.abstractclass_interface.exercise_4;

public class Test {

    public static void main(String[] args) {
        ToTestInt toTestInt = new ToTestInt(new ArithmeticClass());
        toTestInt.getArithmeticClass().square();
    }
}
