package h11_exceptions.exercise_6;

public class CustomArrays {

    private String[] array;


    /**
     * This method calculates sum of elements of array.
     *
     * @return the sum of elements of array.
     */
    public int sumElements() {
        if (isNullOrEmpty()) {
            return -1;
        }

        int sum = 0;
        for (String item : array) {
            sum += Integer.parseInt(item);
        }
        return sum;
    }


    /**
     * This method divides all elements of array by specified divider.
     *
     * @param divider int-type.
     * @return the new String-type array.
     * @throws DivideByZeroException if divider == 0.
     */
    public String[] divideBy(int divider) throws DivideByZeroException {
        if (isNullOrEmpty()) {
            System.out.println("Passed null or empty value: ");
        }
        if (divider == 0) {
            throw new DivideByZeroException("Divide by zero: ");
        }

        String[] newString = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            double newElement = (double) Integer.parseInt(array[i]) / divider;
            newString[i] = String.valueOf(newElement);
        }

        return newString;
    }


    /**
     * This method returns the element with specified index from array.
     *
     * @param index int-type.
     * @return element of specified index.
     */
    public String getBy(int index) {
        if (isNullOrEmpty()) {
            System.out.println("Passed null or empty value: ");
        }
        if (index < 0 || index >= array.length) {
            try {
                throw new IndexOutOfBoundsException("Invalid index: out of bounds: ");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
        }

        return array[index];
    }


    public String[] getArray() {
        return array;
    }


    public void setArray(String[] array) {
        if (isValid(array)) {
            this.array = array;
        }
    }


    /**
     * This method determines is the passed String an integer number or not.
     *
     * @param number String - type.
     * @return true if passed String is an integer number, false otherwise.
     * @throws WrongInputException if as an argument passed non-integer value.
     */
    private boolean isInteger(String number) throws WrongInputException {
        if (number == null || number.isEmpty()) {
            System.out.println("Passed null or empty value: ");
            return false;
        }

        char[] chars = number.toCharArray();
        for (char item : chars) {
            if (!Character.isDigit(item)) {
                throw new WrongInputException("Passed non integer value: ");
            }
        }
        return true;
    }


    /**
     * This method determines is the passed array of integers valid or not.
     *
     * @param array String[] - type. Members must have the format of integer numbers.
     * @return true if passed array is an array of integers, false otherwise.
     */
    private boolean isValid(String[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Passed null or empty value: ");
            return false;
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                if (isInteger(array[i])) {
                    counter++;
                }
            } catch (WrongInputException ex) {
                System.out.println("Invalid input at " + i + " index:");
                return false;
            }
        }
        return counter == array.length;
    }


    /**
     * This method determines is an array null or empty.
     *
     * @return true if array is null or empty, false otherwise.
     */
    private boolean isNullOrEmpty() {
        return array == null || array.length == 0;
    }
}