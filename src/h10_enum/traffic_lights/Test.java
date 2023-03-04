package h10_enum.traffic_lights;

public class Test {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(LightStates.RED);
        System.out.println(trafficLight.getState());
        trafficLight.plusTime(30);
        System.out.println(trafficLight.getState());
        trafficLight.plusTime(3);
        System.out.println(trafficLight.getState());
        trafficLight.plusTime(30);
        System.out.println(trafficLight.getState());
        trafficLight.plusTime(3);
        System.out.println(trafficLight.getState());
        trafficLight.plusTime(30);
    }
}
