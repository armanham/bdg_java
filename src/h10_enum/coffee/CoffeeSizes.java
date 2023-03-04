package h10_enum.coffee;

public enum CoffeeSizes {
    SMALL, MEDIUM, LARGE;

    /**
     * This method gives the ordinal value of each member in this enum.
     *
     * @return the ordinal.
     */
    public int getOrdinal() {
        return this.ordinal();
    }

    /**
     * This method gives the name of each member in this enum.
     *
     * @return the name.
     */
    public String getName() {
        return this.name();
    }
}
