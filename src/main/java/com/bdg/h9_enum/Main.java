package com.bdg.h9_enum;

import com.bdg.h9_enum.data.Planets;
import com.bdg.h9_enum.measures.Units;
import com.bdg.h9_enum.weekdays.WeekDays;

public class Main {

    public static void main(String[] args) {
        Planets planet = Planets.JUPITER;
        System.out.println(planet.nameToLowerCase());
        System.out.println(planet.getName());

        Planets planets1 = Planets.MARS;
        System.out.println(planets1.getYearLength());
        System.out.println(planets1.getDistanceFromSun());

        WeekDays weekDay = WeekDays.SUNDAY;
        System.out.println(weekDay.numberOfTheDay());

        Units units = Units.CELSIUS;
        System.out.println(units.getBaseUnit());
        System.out.println(units.convertTo(43));


//        Shapes shape = Shapes.TRIANGLE;
//        shape.setSides(3,4,1);
//        System.out.println(shape.area());
//
//        Shapes shape1 = Shapes.CIRCLE;
//        shape1.setSides(0);
//        System.out.println(shape1.perimeter());
    }
}
