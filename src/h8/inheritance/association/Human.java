package h8.inheritance.association;

public class Human {

    private String firstName;

    private String lastName;

    private Gender gender;

    private int age;

    private Feet feet;     // One to one relation,,,, Human has a Feet     Strong association(compoz)

    private Hearth hearth;  // One to one relation,,,, Human has a Hearth     Strong association(compoz)

    public Human() {
    }

    public Human(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.hearth = new Hearth(true);
        this.feet = new Feet(10);
    }

    public boolean isAlive() {
        return this.hearth.isAvailable();
    }

    public Feet getFeet() {
        return feet;
    }

    public void setFeet(Feet feet) {
        this.feet = feet;
    }

    public Hearth getHearth() {
        return hearth;
    }

    public void setHearth(Hearth hearth) {
        this.hearth = hearth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", feet=" + feet +
                ", hearth=" + hearth +
                "}\n";
    }

    class Hearth {

        private boolean available;

        public Hearth(boolean available) {
            this.available = available;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        @Override
        public String toString() {
            return "Hearth{" +
                    "available=" + available +
                    "}\n";
        }
    }

    class Feet {
        private int countOfFingers;

        public Feet(int countOfFingers) {
            this.countOfFingers = countOfFingers;
        }

        public int getCountOfFingers() {
            return countOfFingers;
        }

        public void setCountOfFingers(int countOfFingers) {
            this.countOfFingers = countOfFingers;
        }

        @Override
        public String toString() {
            return "Feet{" +
                    "countOfFingers=" + countOfFingers +
                    "}\n";
        }
    }
}