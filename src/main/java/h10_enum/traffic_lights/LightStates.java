package h10_enum.traffic_lights;

public enum LightStates {
    GREEN {
        @Override
        public void message() {
            System.out.println("Qshi apeh");
        }
    }, YELLOW_STOP {
        @Override
        public void message() {
            System.out.println("Qic XALASTO brat");
        }
    }, YELLOW_GO {
        @Override
        public void message() {
            System.out.println("Qic pervi brat");
        }
    }, RED {
        @Override
        public void message() {
            System.out.println("Qor es? Karmir a, ur es signal tali?");
        }
    };


    /**
     * This abstract method implemented in members of this enum
     * to print each state's message.
     */
    public abstract void message();
}