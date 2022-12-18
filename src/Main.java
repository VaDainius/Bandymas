import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Customer> customers = List.of(
                new Customer("Joans","Matt", 20),
                new Customer("Elena", "Kozbic", 40),
                new Customer("Aurimas","Sajauskas", 39),
                new Customer("Giedre", "Liliene",21),
                new Customer("Virzilas", "Andreikis",42),
                new Customer("Anthony", "Burkins",31),
                new Customer("Britney", "Butters",25)

        );

        customers.stream().
                forEach(System.out::println);
    }
}