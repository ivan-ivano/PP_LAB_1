package task7;
import task6.convertCurrency;

public class Transaction {

    private final convertCurrency convCurr = new convertCurrency();

    public boolean transfer(final BankAccount fromAccount, final BankAccount toAccount, final double amount) {
        if (fromAccount == null || toAccount == null) {
            throw new IllegalArgumentException("Both accounts must be provided");
        }

        final double convertedAmount = convertAmount(amount, fromAccount.getCurrency(), toAccount.getCurrency());
        final double fee = calcFee(fromAccount, toAccount, amount);

        if (fromAccount.withdraw(amount + fee)) {
            toAccount.deposit(convertedAmount);
            return true;
        } else {
            return false;
        }
    }

    private double convertAmount(final double amount, final String fromCurrency, final String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return amount;
        }

        return convertCurrency.conCurrency(amount, fromCurrency, toCurrency);
    }

    private double calcFee(final BankAccount fromAccount, final BankAccount toAccount, final double amount) {
        if (fromAccount.getBank().equals(toAccount.getBank())) {
            if (fromAccount.getOwner().equals(toAccount.getOwner())) {
                return amount; // Переказ між власними рахунками в межах одного банку
            } else {
                return amount * 0.03; // Переказ між власними рахунками у різних банках
            }
        } else {
            if (fromAccount.getOwner().equals(toAccount.getOwner())) {
                return amount * 0.02; // Переказ між рахунками різних користувачів в одному банку
            } else {
                return amount * 0.06; // Переказ між рахунками різних користувачів у різних банках
            }
        }
    }
}