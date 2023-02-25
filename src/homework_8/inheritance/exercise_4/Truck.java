package homework_8.inheritance.exercise_4;

public class Truck extends Car {

    private int capacity;

    public Truck(int passengerCount, Character engineType, int capacity) {
        super(passengerCount, engineType);  //TODO mi hat laaaav usumnasirel
        setCapacity(capacity);              // hishoxutyan mej ka info ayn masin vor childy extend a anum parentic
    }

    public Truck(int passengerCount, Character engineType) {
        super(passengerCount, engineType);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Wrong capacity:");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "capacity=" + capacity +
                '}';
    }
}
