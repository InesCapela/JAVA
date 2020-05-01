package edu.ufp.inf.lp2.Bank;

public class AccountSafe extends Account {

    public AccountSafe(String accountNumber, double balance, Client owner) {
        super(accountNumber, balance, owner);
    }

    public AccountSafe(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double withdraw(double amount) throws OverWithdrawException {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
            return getBalance();
        } else {
            throw new OverWithdrawException(("not enough money to withdraw"));
            //return getBalance();
        }

    }

    @Override
    public double deposit(double amount) throws IllicitDepositException {
        if (amount > 0.0) {
            this.setBalance(this.getBalance() + amount);
            return getBalance();
        } else {
            //System.out.println("2222");
            //return getBalance();
            throw new IllicitDepositException("nao pode transferir valores negativos");
        }
    }

    @Override
    public double transfer(AccountMoneyI destination, double amount) throws OverWithdrawException, IllicitDepositException {
        /*double prevBalance = this.balance();
        double b= this.withdraw(amount);
        if (prevBalance > b) {
            destination.deposit(amount);
        }
        return this.balance();*/

        double prevBalance = this.balance();
        double b= this.withdraw(amount);
        try {
            destination.deposit(amount);
        } catch (IllicitDepositException e) {
            setBalance(amount+getBalance());
            throw new IllicitDepositException("Não posso depositar valores negativos, previusvalue foi corrigido");
        }
        return b;
    }

    @Override
    public double balance() {
        return getBalance();
    }

}
