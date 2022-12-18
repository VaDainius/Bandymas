public class Customer {

    private String vardas;
    private String pavarde;
    private int amzius;


    public Customer(String vardas, String pavarde, int amzius) {
        this.vardas = vardas;
        this.amzius = amzius;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getPavarde() {
        return pavarde;
    }

    @Override
    public String toString() {
        return "Customer: " +
                vardas + ", " +
                pavarde + ", " +
                amzius + " metu(-ai)";
    }
}
