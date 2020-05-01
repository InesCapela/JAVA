package edu.ufp.inf.lp2.Bank;

import java.util.Objects;

public abstract class Account implements AccountMoneyI {

    private final String accountNumber;
    private double balance;
    private Client owner;


    public Account(String accountNumber, double balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = null;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public abstract double withdraw(double amount) throws OverWithdrawException;

    public abstract double deposit(double amount) throws IllicitDepositException;
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account=(Account) o;
        return Double.compare(account.getBalance(), getBalance()) == 0 &&
                Objects.equals(getAccountNumber(), account.getAccountNumber()) &&
                Objects.equals(getOwner(), account.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), getBalance(), getOwner());
    }
}
