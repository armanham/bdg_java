package h9_enum.weekdays;

public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    /**
     * This method returns number of weekday.
     * Monday - 1.
     * Friday - 5.
     * Sunday - 7.
     *
     * @return number of weekday.
     */
    public int numberOfTheDay() {
        return this.ordinal() + 1;
    }
}
