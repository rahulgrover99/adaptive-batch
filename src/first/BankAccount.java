package first;


public class BankAccount {
    // default.
    double balance;
    private String ownerName;

    // Constructor to initialize account
    // Automatically called when the objet is created.
    public BankAccount(String name, double initialBalance) {
        ownerName = name;
        balance = initialBalance;
        System.out.println("Constructor called.");
    }

    // Deposit method
    void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }
//        ownerName = "";
    }

    // Withdraw method (checks if enough balance)
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display balance
    void showBalance() {
        System.out.println(ownerName + "'s Balance: $" + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 500);
        myAccount.showBalance();
        myAccount.deposit(200);
        myAccount.withdraw(100);
        myAccount.showBalance();
    }
}