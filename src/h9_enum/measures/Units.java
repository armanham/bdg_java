package h9_enum.measures;

public enum Units {
    METER {
        @Override
        public String getBaseUnit() {
            return String.valueOf(METER);
        }
    }, KILOGRAM {
        @Override
        public String getBaseUnit() {
            return String.valueOf(KILOGRAM);
        }
    }, SECOND {
        @Override
        public String getBaseUnit() {
            return String.valueOf(SECOND);
        }
    }, AMPERE {
        @Override
        public String getBaseUnit() {
            return String.valueOf(AMPERE);
        }
    }, KELVIN {
        @Override
        public String getBaseUnit() {
            return String.valueOf(KELVIN);
        }
    }, MOLE {
        @Override
        public String getBaseUnit() {
            return String.valueOf(MOLE);
        }
    }, CANDELA {
        @Override
        public String getBaseUnit() {
            return String.valueOf(CANDELA);
        }
    }, NEWTON{
        @Override
        public String getBaseUnit() {
            return KILOGRAM + " * " + METER + " / " + SECOND + "^2";
        }
    }, MINUTE {
        @Override
        public String getBaseUnit() {
            return SECOND + " / 60";
        }
    }, CELSIUS {
        @Override
        public String getBaseUnit() {
            return KELVIN + " - 273";
        }
    }, KILOMETER {
        @Override
        public String getBaseUnit() {
            return METER + " * 1000";
        }
    };

    /**
     * This abstract method returns the base unit for specified measure.
     *
     * @return the base unit for specified measure as a String.
     */
    public abstract String getBaseUnit();
}
