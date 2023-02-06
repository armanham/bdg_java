package homework_5;

public class Question12 {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("________________");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("________________");

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
