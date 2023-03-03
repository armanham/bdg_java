package h9_enum.data;

//exercise 1 and 4
public enum Planets {
    MERCURY("Mercury", 88, 58),
    VENUS("Venus", 225, 108),
    EARTH("Earth", 365, 150),
    MARS("Mars", 687, 228),
    JUPITER("Jupiter", 4333, 778),
    SATURN("Saturn", 10759, 912),
    URANUS("Uranus", 30687, 2900),
    NEPTUNE("Neptune", 60200, 4500);

    private String name;
    private int yearLength;
    private double distanceFromSun;

    Planets(String name, int yearLength, double distanceFromSun) { //constructor of enum by default is private
        if (!name.isEmpty()) {
            this.name = name;
        }
        if (yearLength > 0) {
            this.yearLength = yearLength;
        }
        if (distanceFromSun > 0) {
            this.distanceFromSun = distanceFromSun;
        }
    }

    /**
     * This method converts uppercase letters of 'name' filed to lowercase.
     *
     * @return non-capitalized String.
     */
    public String nameToLowerCase() {
        return this.name.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    /**
     * This method returns distance of specified planet from sun with millionKilometers.
     *
     * @return distance from sun with millionKilometers.
     */
    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
