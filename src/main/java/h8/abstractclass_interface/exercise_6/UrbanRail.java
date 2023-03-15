package h8.abstractclass_interface.exercise_6;

public class UrbanRail extends MBTAVehicle {

    private RightOfWays rightOfWays;

    public UrbanRail(RightOfWays rightOfWays, int number) {
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
        return "UrbanRail{" +
                "rightOfWays=" + rightOfWays +
                ", number=" + number +
                '}';
    }
}
