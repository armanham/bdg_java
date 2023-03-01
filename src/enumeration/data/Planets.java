package enumeration.data;

public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private String name;
    private int yearLength;

    Planets(String name, int yearLength) { //constructor of enum by default is private
        if (!name.isEmpty()) {
            this.name = name;
        }
        if (yearLength > 0) {
            this.yearLength = yearLength;
        }
    }

    public String nameToLowerCase() {
        return this.name.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}
