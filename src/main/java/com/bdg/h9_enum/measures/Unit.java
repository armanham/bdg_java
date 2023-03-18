package com.bdg.h9_enum.measures;

public enum Unit {
    METER("meter", null),
    KILOGRAM("kilogram", null),
    SECOND("second", null),
    AMPERE("ampere", null),
    KELVIN("kelvin", null),
    MOLE("mole", null),
    CANDELA("candela", null),
    NEWTON("newton", KILOGRAM, METER, SECOND, -2, 1, 0, 0),
    JOULE("joule", KILOGRAM, METER, SECOND, -2, 2, 0, 0),
    WATT("watt", KILOGRAM, METER, SECOND, -3, 2, 0, 0);
    private String name;
    private Unit baseUnit;
    private int[] exponents;

    private Unit(String name, Unit baseUnit) {
        this.name = name;
        this.baseUnit = baseUnit == null ? this : baseUnit;
        this.exponents = new int[7];
        if (baseUnit != null) {
            System.arraycopy(baseUnit.exponents, 0, exponents, 0, 7);
        }
    }

    private Unit(String name,
                 Unit baseUnit,
                 int massExp,
                 int lengthExp,
                 int timeExp,
                 int currentExp,
                 int temperatureExp,
                 int amountExp,
                 int luminousExp) {
        this(name, baseUnit);
        this.exponents[0] = massExp;
        this.exponents[1] = lengthExp;
        this.exponents[2] = timeExp;
        this.exponents[3] = currentExp;
        this.exponents[4] = temperatureExp;
        this.exponents[5] = amountExp;
        this.exponents[6] = luminousExp;
    }

    Unit(String watt, Unit kilogram, Unit meter, Unit second, int i, int i1, int i2, int i3) {
    }

    public String getName() {
        return name;
    }

    public Unit getBaseUnit() {
        return baseUnit;
    }

    public int[] getExponents() {
        return exponents;
    }

    public double convertTo(double value, Unit otherUnit) {
        if (this == otherUnit) {
            return value;
        }
        if (this.baseUnit != otherUnit.baseUnit) {
            throw new IllegalArgumentException("Incompatible units");
        }
        double factor = 1;
        for (int i = 0; i < exponents.length; i++) {
            factor *= Math.pow(otherUnit.exponents[i] * 1.0 / exponents[i], exponents[i]);
        }
        return value * factor;
    }
}
