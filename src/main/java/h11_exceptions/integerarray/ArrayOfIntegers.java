package h11_exceptions.integerarray;

import java.util.List;

public class ArrayOfIntegers {

    //Tipy String em pahel vor scannerov inputi jamanak xndir chunenam, inch uzenam poxancem
    //heto sax poxanceluc heto nor validationners u exceptionners ashxaten
    private List<String> integers;


    /**
     * This method calculates sum of elements of array.
     *
     * @return the sum of elements of array.
     */
    public int sumElements() {
        if (integers.size() == 0) {
            System.out.println("Passed an empty array");
            return -1;
        }

        int sum = 0;
        for (String item : integers) {
            try {
                if (isInteger(String.valueOf(item))) {
                    sum += Integer.parseInt(item);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage() + item);
                return -1;
            }
        }
        return sum;
    }


    public List<String> getIntegers() {
        return integers;
    }


    public void setIntegers(List<String> integers) {
        this.integers = integers;
    }


    /**
     * This method determines is the passed String an integer number or not.
     *
     * @param number String - type.
     * @return true if passed String is an integer number, false otherwise.
     * @throws IllegalArgumentException if as an argument passed non-integer value.
     */
    private boolean isInteger(String number) throws IllegalArgumentException {
        if (number == null || number.isEmpty()) {
            System.out.println("Passed null or empty value: ");
            return false;
        }

        char[] chars = number.toCharArray();
        for (char item : chars) {
            if (!Character.isDigit(item)) {
                throw new IllegalArgumentException("Passed non integer value: ");
            }
        }
        return true;
    }
}