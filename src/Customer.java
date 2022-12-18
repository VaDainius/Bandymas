public class Customer {

    private String vardas;
    private int amzius;

    public Customer(String vardas, int amzius) {
        this.vardas = vardas;
        this.amzius = amzius;
    }

    public String getVardas() {
        return vardas;
    }

    public int getAmzius() {
        return amzius;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "vardas - " + vardas +
                ", amzius - " + amzius;
    }
}
