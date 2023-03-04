package h10_enum.solarsystem;

public enum Planets {

    MERCURY("Mercury", 0.330, 58),
    VENUS("Venus", 4.87, 108),
    EARTH("Earth", 5.97, 150),
    MARS("Mars", 0.642, 228),
    JUPITER("Jupiter", 1898, 778),
    SATURN("Saturn", 568, 912),
    URANUS("Uranus", 86.8, 2900),
    NEPTUNE("Neptune", 102, 4500);

    private String name;
    private double mass;
    private double distanceFromSun;

    Planets(String name, double mass, double distanceFromSun) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        if (mass > 0) {
            this.mass = mass;
        }
        if (distanceFromSun > 0) {
            this.distanceFromSun = distanceFromSun;
        }
    }

    public String getName() {
        return name;
    }

    /**
     * This method returns distance of specified planet from sun with millionKilometers.
     *
     * @return distance from sun with millionKilometers.
     */
    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    /**
     * This method returns mass of specified planet with *10^24 kiloGram.
     * @return mass of planet with *10^24 kiloGram.
     */
    public double getMass(){
        return mass;
    }
}
