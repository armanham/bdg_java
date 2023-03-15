package h8.inheritance.exercise_4;

public class Truck extends Car {

    private int capacity;

    public Truck(int passengerCount, Character engineType, int capacity) {
        super(passengerCount, engineType);
        setCapacity(capacity);
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
