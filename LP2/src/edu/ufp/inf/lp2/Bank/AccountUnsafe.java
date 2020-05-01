package edu.ufp.inf.lp2.Bank;

public class AccountUnsafe extends Account{

    public AccountUnsafe(String accountNumber, double balance, Client owner) {
        super(accountNumber, balance, owner);
    }

    public AccountUnsafe(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double withdraw(double amount){
        super.setBalance(super.getBalance()-amount);
        return getBalance();
    }

    @Override
    public double deposit(double amount){
        this.setBalance(this.getBalance()+amount);
        return super.getBalance();
    }

    @Override
    public double transfer(AccountMoneyI destination, double amount) {
        double b= this.withdraw(amount);
        ((AccountUnsafe)destination).deposit(amount);
        return b;
    }

    @Override
    public double balance() {
        return getBalance();

    }
}
