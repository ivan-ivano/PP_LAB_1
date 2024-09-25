package task7;

import java.util.HashSet;
import java.util.Set;

public class BankAccount {
    private static final Set<String> accountNumbers = new HashSet<>();

    private final String number;
    private final Bank bank;
    private final String currency;
    private double balance;
    private User owner = new User();

    public BankAccount(String number, Bank bank, String currency, double initialBalance) {
        if (!accountNumbers.add(number)) {
            throw new IllegalArgumentException("This number already exists");
        }
        this.number = number;
        this.bank = bank;
        this.currency = currency;
        this.balance = initialBalance;
    }

    public String getNumber() {
        return number;
    }

    public Bank getBank() {
        return bank;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void deposit(final double amount) {
        balance += amount;
    }

    public boolean withdraw(final double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}