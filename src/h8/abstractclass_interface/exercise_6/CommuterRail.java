package h8.abstractclass_interface.exercise_6;

public class CommuterRail extends MBTAVehicle {

    private RightOfWays rightOfWays;

    public CommuterRail(RightOfWays rightOfWays, int number) {
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
        return "CommuterRail{" +
                "rightOfWays=" + rightOfWays +
                ", number=" + number +
                '}';
    }
}
