package h10_enum.traffic_lights;

public class TrafficLight extends LightService {

    private LightStates state;

    public TrafficLight(LightStates state) {
        this.state = state;
    }

    @Override
    public void changeState() {
        switch (getState()) {
            case RED -> setState(LightStates.YELLOW_GO);
            case YELLOW_GO -> setState(LightStates.GREEN);
            case GREEN -> setState(LightStates.YELLOW_STOP);
            case YELLOW_STOP -> setState(LightStates.RED);
        }
    }

    /**
     * This method used for incrementing time of traffic light.
     * In this method called the overrided changeState() method.
     *
     * @param second int-type. (0 ; Integer.MAX_VALUE].
     */
    public void plusTime(int second) {
        if (second < 0) {
            throw new IllegalArgumentException("Passed parameter must be positive number");
        }
        if (second == 30 && (this.state == LightStates.RED || this.state == LightStates.GREEN)) {
            changeState();
        } else if (second == 3 && (this.state == LightStates.YELLOW_GO || this.state == LightStates.YELLOW_STOP)) {
            changeState();
        } else {
            throw new IllegalArgumentException("TrafficLight not available, timer is crushed.");
        }
    }

    public LightStates getState() {
        return state;
    }

    public void setState(LightStates state) {
        this.state = state;
    }
}