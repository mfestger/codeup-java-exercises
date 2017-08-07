package io;

/**
 * Created by michaelfestger on 5/24/17.
 */
public class Account {
    private double balance;

    // we cannot create account with a negative balance
    //invariant
    // 2 types of exceptions: (These rules are enforced at compile time)
        // Checked exceptions -> they must be caught
        // Unchecked exceptions -> they might not be caught
    public Account(double initialBalance) throws Exception {
        // guard clauses
        if(initialBalance < 0) {
            throw new Exception("Accounts cannot have a negative balance");
        }
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    // this is an unchecked exception
    public void withdrawel(double amount){
        if (amount < 0) {
            throw new RuntimeException("Cannot withdraw a negative amount.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
