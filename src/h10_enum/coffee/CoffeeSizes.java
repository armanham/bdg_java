package h10_enum.coffee;

public enum CoffeeSizes {
    SMALL, MEDIUM, LARGE;

    public int getOrdinal() {
        return this.ordinal();
    }

    public String getName() {
        return this.name();
    }
}
