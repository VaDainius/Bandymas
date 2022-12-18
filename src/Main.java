import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Customer> customers = List.of(
                new Customer("Joans", 20),
                new Customer("Elena", 40),
                new Customer("Aurimas", 39),
                new Customer("Giedre", 21),
                new Customer("Virzilas", 42),
                new Customer("Anthony", 31),
                new Customer("Britney", 25)

        );

        customers.stream().
                forEach(System.out::println);
    }
}