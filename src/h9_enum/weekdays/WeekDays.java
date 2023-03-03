package h9_enum.weekdays;

public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public int numberOfTheDay() {
        return this.ordinal() + 1;
    }
}
