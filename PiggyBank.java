public class PiggyBank {
    private final String id;
    private double savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
            System.out.println("Deposited: " + amount + " -> savings = " + (int) savings);
        }
    }

    public void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Withdrawal of " + amount + " rejected, savings stays " + (int) savings);
        } else if (amount > 0) {
            savings -= amount;
            System.out.println("Withdrew: " + amount + " -> savings = " + (int) savings);
        }
    }

    public double getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
    }
}
