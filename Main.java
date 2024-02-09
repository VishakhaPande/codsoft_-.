// Main class
public class Main {
    public static void main(String[] args) {
        double initialBalance = 1000;
        BankAccount bankAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(bankAccount);
        atm.run();
    }
}