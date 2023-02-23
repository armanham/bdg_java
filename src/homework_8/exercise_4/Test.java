package homework_8.exercise_4;

public class Test {

    public static void main(String[] args) {
        Car truck = new Truck(2,'A', 0);
        truck.setEngineType('B');
        System.out.println(truck.toString());
    }
}
