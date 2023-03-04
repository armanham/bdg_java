package h10_enum.coffee;

public class Test {
    public static void main(String[] args) {

        CoffeeSizes sizes = CoffeeSizes.LARGE;
        System.out.println(sizes.getName());
        System.out.println(sizes.getOrdinal());
    }
}
