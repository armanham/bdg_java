package com.bdg.h10_enum.seasons;

public class SeasonsService {

    /**
     * This method finds the season that corresponds to passed temperature.
     *
     * @param temperature int-type.
     * @return season that corresponds to temperature.
     */
    public Seasons getSeason(int temperature) {
        if (temperature >= Seasons.WINTER.getMinTemperature() && temperature <= Seasons.WINTER.getMaxTemperature()) {
            return Seasons.WINTER;
        } else if (temperature >= Seasons.SPRING.getMinTemperature() && temperature <= Seasons.SPRING.getMaxTemperature()) {
            return Seasons.SPRING;
        } else if (temperature >= Seasons.SUMMER.getMinTemperature() && temperature <= Seasons.SUMMER.getMaxTemperature()) {
            return Seasons.SUMMER;
        } else if (temperature >= Seasons.FALL.getMinTemperature() && temperature <= Seasons.FALL.getMaxTemperature()) {
            return Seasons.FALL;
        }
        return null;
    }
}
