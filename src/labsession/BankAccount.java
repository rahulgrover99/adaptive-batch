package labsession;

public class BankAccount {
    private Long balance = 0L;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }


    // Class level lock (class.lock())
    public synchronized static void temp() {
        System.out.println("hello");
    }

    // Object level lock. (object.lock())
    public synchronized void deposit(Long amount){
        // synchronized would ensure that the caller has the
        // access to the lock of bank account;
        if(amount > 0){
            balance += amount;
        }
    }

    public synchronized void withdraw(Long amount){
        if(balance >= amount && amount > 0){
            balance -= amount;
        }
    }
}

