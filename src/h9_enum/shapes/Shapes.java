package h9_enum.shapes;

public enum Shapes {
    SQUARE {
        private double side;

        /**
         * This method calculates area of a square.
         * @return area of a square.
         */
        @Override
        public double area() {
            return Math.pow(side, 2);
        }

        /**
         * This method calculates perimeter of a square.
         * @return perimeter of a square.
         */
        @Override
        public double perimeter() {
            return 4 * side;
        }

        /**
         * This method help us to set 'sides' of a square.
         * All sides of a square are equal, in input must be one parameter.
         * @param sides double... - type. 1 input parameter.
         */
        @Override
        public void setSides(double... sides) {
            if (sides.length != 1) {
                System.out.println("All sides of a square are equal, in input must be one parameter: ");
                return;
            }
            if (sides[0] <= 0) {
                System.out.println("Side of square must be positive number: ");
                return;
            }
            this.side = sides[0];
        }

        public double getSide() {
            return side;
        }
    },

    TRIANGLE {
        private double side1;
        private double side2;
        private double side3;

        /**
         * This method calculates area of a triangle.
         * @return area of a triangle.
         */
        @Override
        public double area() {
            double p = perimeter();
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }

        /**
         * This method calculates perimeter of a triangle.
         * @return perimeter of a triangle.
         */
        @Override
        public double perimeter() {
            return (side1 + side2 + side3) / 2;
        }

        /**
         * This method help us to set sides of a triangle.
         * @param sides double... - type. 3 input parameters.
         */
        @Override
        public void setSides(double... sides) {
            if (isTriangleValid(sides)) {
                side1 = sides[0];
                side2 = sides[1];
                side3 = sides[2];
            }
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        /**
         * This method determines is a triangle valid or not.
         * @param sides double... - type.
         * @return true if a triangle is valid, false otherwise.
         */
        private boolean isTriangleValid(double... sides) {
            if (sides.length != 3) {
                System.out.println("Triangle must have 3 sides: ");
                return false;
            }
            if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0) {
                System.out.println("Sides of triangle must be positive numbers: ");
                return false;
            }
            return (sides[0] + sides[1]) > sides[2] &&
                    (sides[0] + sides[2]) > sides[1] &&
                    (sides[1] + sides[2]) > sides[0];
        }
    },

    CIRCLE {
        private double radius;

        /**
         * This method calculates area of a circle.
         * @return area of a circle.
         */
        @Override
        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }

        /**
         * This method calculates perimeter of a circle.
         * @return perimeter of a circle.
         */
        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        /**
         * This method help us to set radius of a circle.
         * @param sides double... - type. 1 input parameter.
         */
        @Override
        public void setSides(double... sides) { // hamadzayn em methodi anuny stex texin chi... bayc abstraction em ogtagorcel u vorpes yndhanur depq indz tvum a vor khaskacvi
            if (sides.length != 1) {
                System.out.println("In input must be one parameter: ");
                return;
            }
            if (sides[0] <= 0) {
                System.out.println("Radius of circle must be positive number: ");
                return;
            }
            this.radius = sides[0];
        }
    };


    /**
     * This abstract method used for to calculate area of specified shape.
     */
    public abstract double area();

    /**
     * This abstract method used for to calculate perimeter of specified shape.
     */
    public abstract double perimeter();

    /**
     * This abstract method used for to set side or sides of specified shape.
     *
     * @param sides double... - type.
     */
    public abstract void setSides(double... sides);
}
