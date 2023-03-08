package h11_exceptions.invalidage;

public class AgeValidator {

    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            validate(age);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
        this.age = age;
    }


    /**
     * This method validates passed age.
     *
     * @param age int-type.
     * @throws InvalidAgeException if passed invalid age.
     */
    private void validate(int age) throws InvalidAgeException {
        if (age >= 120 || age <= 0) {
            throw new InvalidAgeException("Invalid age: ");
        } else {
            System.out.println("Valid age: ");
        }
    }
}