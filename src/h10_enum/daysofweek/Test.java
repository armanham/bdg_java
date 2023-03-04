package h10_enum.daysofweek;

public class Test {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.SUNDAY;
        DaysOfWeekService service = new DaysOfWeekService();

        service.weekdayOrWeekend(day);
    }
}
