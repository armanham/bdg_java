package h2_methods;

public class Application {

    public static void main(String[] args) {

    }

    int method1(int a, int b) {
        return 0;
    }

    void method2() {

    }

    void method3(boolean a) {
        System.out.println("Hello World");
    }

    char method4(char a) {
        return a;
    }

    float method5(float a, float b) {
        return a;
    }

    void method6() {
        method6();
    }

    /**
     * @param a an integer number.
     * @param b an integer number.
     * @return sum of a, b.
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * @param start 1st number of natural sequence.
     * @param end   last number of natural sequence.
     * @return sum of all natural numbers in [start; end].
     * @throws IllegalArgumentException if parameter end less or equal than parameter start.
     */
    public int sumOfSequenceOfNumbers(int start, int end) throws IllegalArgumentException {
        if (end <= start) {
            throw new IllegalArgumentException("Parameter end must be greater than start:");
        }
        int sum = 0;
        int countOfSequence = end - start + 1;
        for (int i = 0; i < countOfSequence; i++) {
            sum += start;
            start += 1;
        }
        return sum;
    }
}