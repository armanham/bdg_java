package abstract_interface_inheritance.abstractclass_interface.exercise_6;

public class MBTAVehicle {

    public int number;

    public MBTAVehicle() {
    }

    public MBTAVehicle(int number) {
        if (number >= 0) {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }
}
