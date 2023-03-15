package h5_algorithmic_exercises;

public class Question8 {

    public static void main(String[] args) {

        //Question 8
        //Write a program to print out all Armstrong numbers between 1 and 500. If sum
        //of cubes of each digit of the number is equal to the number itself, then the
        //number is called an Armstrong number.
        //For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

        AlgorithmicExercises algorithmicExercises = new AlgorithmicExercises();

        for (int i = 2; i < 500; i++) {
            if (algorithmicExercises.isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
