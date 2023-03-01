package abstract_interface_inheritance.abstractclass_interface.exercise_6;

public class Bus extends MBTAVehicle {

    private RightOfWays rightOfWays;

    public Bus(RightOfWays rightOfWays, int number) {
        super(number);
        this.rightOfWays = rightOfWays;
    }

    public RightOfWays getRightOfWays() {
        return rightOfWays;
    }

    public void setRightOfWays(RightOfWays rightOfWays) {
        this.rightOfWays = rightOfWays;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "rightOfWays=" + rightOfWays +
                ", number=" + number +
                '}';
    }
}
