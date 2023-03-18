package com.bdg.h10_enum.daysofweek;

public class DaysOfWeekService {

    /**
     * This method determines is the weekday or weekend.
     *
     * @param dayOfWeek h10_enum.daysofweek.DaysOfWeek - type.
     */
    public void weekdayOrWeekend(DaysOfWeek dayOfWeek) {
        if (dayOfWeek == null) {
            System.out.println("Passed null argument");
            return;
        }
        if (dayOfWeek.getNumberOfDay() == 6 || dayOfWeek.getNumberOfDay() == 7) {
            System.out.println(dayOfWeek.name() + " is a weekend day!!!");
        } else {
            System.out.println(dayOfWeek.name() + " is a weekday(((");
        }
    }
}