package h3.class_object;

public class Main {
    public static void main(String[] args) {

        //Ստեղծել  Yerevan, Moscow, New York , Paris
        //քաղաքները  համապատասխան մարդաքանակով ։
        City yerevan = new City("Yerevan", 1_000_000);
        City moscow = new City("Moscow", 2_500_000);
        City newYork = new City("New York", 3_000_000);
        City paris = new City("Paris", 3_000_000);

        System.out.println(yerevan.toString());
        System.out.println(moscow.toString());
        System.out.println(newYork.toString());
        System.out.println(paris.toString());


        //Ստեղծել  ուղղանկյուն (բարձրություն 5,  լայքն 14)
        //եւ հաշվել  ուղղանկյան մակերեսը
        Rectangle rectangle = new Rectangle(5.0, 14.0);
        System.out.println(rectangle.calculateArea());


        //Ստեղծել  3 աշխատող( 2 տղա եւ 1 աղջիկ), որոնցից երկուսը աշխատում են
        //նույն դեպարտամենտում եւ ունեն նույն տարիքը։
        Employee employee1 = new Employee(1234, "Arman", "BDG", 20, "male");
        Employee employee2 = new Employee(1244, "Armen", "ACA", 22, "male");
        Employee employee3 = new Employee(1334, "Anahit", "BDG", 20, "femal");
        employee1.printEmployee();
        employee2.printEmployee();
        employee3.printEmployee();


        //Ստեղծել Mercedes  C203 սեւ   եւ   S505 սպիտակ  մակնիշի
        //մեքենաներ.
        Car mercedesC203 = new Car("Mercedes C203", "black");
        Car mercedesS505 = new Car("Mercedes S505", "white");
        System.out.println(mercedesC203.isEngineStart());
        mercedesC203.startEngine();
        System.out.println(mercedesC203.isEngineStart());

    }
}
