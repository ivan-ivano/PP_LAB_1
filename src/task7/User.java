package task7;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final String name;
    private final Set<BankAccount> accounts = new HashSet<>();

    public User(final String name) {
        this.name = name;
    }

    public User(){
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public Set<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(final BankAccount account) {
        account.setOwner(this);
        accounts.add(account);
    }
}