package labsession;

public class BankAccountSimulator {

    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();

//        Runnable depositor = () -> {
//            for (long i = 0; i < 100000; i++) {
//                bankAccount.deposit(i);
//            }
//        };
        Runnable depositor = new Depositor(bankAccount);

        Runnable withdrawers = () -> {
            for (long i = 0; i < 100000; i++) {
                bankAccount.withdraw(i);
            }
        };

        Thread t1 = new Thread(depositor);
        Thread t2 = new Thread(withdrawers);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(bankAccount.getBalance());

    }
}
