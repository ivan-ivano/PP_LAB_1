package task7;

public class task7 {

    public static void main(String[] args) {
        try {
            Bank bankA = new Bank("A-Bank");
            Bank bankM = new Bank("MonoBank");

            User roman = new User("Roman");
            User oleg = new User("Oleg");

            BankAccount acc1 = new BankAccount("1", bankA, "USD", 100);
            BankAccount acc2 = new BankAccount("2", bankA, "USD", 50);
            BankAccount acc3 = new BankAccount("3", bankM, "EUR", 25);
            BankAccount acc4 = new BankAccount("4", bankM, "EUR", 300);

            roman.addAccount(acc1);
            roman.addAccount(acc2);
            oleg.addAccount(acc3);
            oleg.addAccount(acc4);

            Transaction trans = new Transaction();

            displayBalance(roman);
            displayBalance(oleg);

            executeTransfer(acc1, acc2, 10, trans);
            executeTransfer(acc1, acc3, 2, trans);
            executeTransfer(acc3, acc4, 5, trans);
            executeTransfer(acc2, acc4, 30, trans);

            displayBalance(roman);
            displayBalance(oleg);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unknown error: " + e.getMessage());
        }
    }

    private static void displayBalance(User user) {
        System.out.println("User: " + user.getName());
        for (BankAccount account : user.getAccounts()) {
            System.out.println("Account " + account.getNumber() + " Balance: " + account.getBalance() + " " + account.getCurrency());
        }
    }

    private static void executeTransfer(BankAccount from, BankAccount to, double amount, Transaction transactionHandler) {
        if (transactionHandler.transfer(from, to, amount)) {
            System.out.println("Transferred " + amount + " " + from.getCurrency() + " from account " + from.getNumber() +
                    " to account " + to.getNumber());
        }
    }
}
