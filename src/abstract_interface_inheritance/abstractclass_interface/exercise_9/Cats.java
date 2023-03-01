package abstract_interface_inheritance.abstractclass_interface.exercise_9;

public class Cats extends Animals{

    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    //Sa arajin concrete classneric mekn a u partavor a sax abstract-nery implementi
    @Override
    void dogs() {
        System.out.println("Jamanakin katun chon er");
    }
}
