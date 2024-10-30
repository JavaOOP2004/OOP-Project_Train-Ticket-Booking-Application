public class Wallet {
    private int balance , deposit , withdraw;

    public Wallet(int balance, int deposit, int withdraw) {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public int getBalance() {
        return balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
    
}
