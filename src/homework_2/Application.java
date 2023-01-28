package homework_2;

public class Application {

    public static void main(String[] args) {
        int num = sumOfSequenceOfNaturalNumbers(1, 4);
        System.out.println(num);
    }

    static int method1(int a, int b) {
        return 0;
    }

    static void method2() {

    }

    static void method3(boolean a) {
        System.out.println("Hello World");
    }

    static char method4(char a) {
        return a;
    }

    static float method5(float a, float b) {
        return a;
    }

    static void method6() {
        method6();
    }

    /**
     * @param a an integer number
     * @param b an integer number
     * @return sum of a, b
     */
    static int sum(int a, int b) {
        return a + b;
    }

    /**
     * @param start - 1st number of natural sequence
     * @param end   - last number of natural sequence
     * @return sum of all numbers in sequence
     */
    static int sumOfSequenceOfNaturalNumbers(int start, int end) {
        int sum = 0;
        int countOfSequence = end - start + 1;
        for (int i = 0; i < countOfSequence; i++) {
            sum += start;
            start += 1;
        }
        return sum;
    }
}
