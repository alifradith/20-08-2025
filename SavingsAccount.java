

    
public class SavingsAccount {
    public String name;
    public double balance;
    public double interestRate;

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }
}