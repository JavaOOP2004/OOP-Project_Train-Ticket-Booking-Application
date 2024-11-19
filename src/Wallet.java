public class Wallet {
    private int balance;

    public Wallet() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Phương thức nạp tiền
    public void Deposit(int deposit){
        balance += deposit;
        System.out.printf("- Ban da nap %dđ vao vi!\n", deposit);
    }

    // Phương thức rút tiền
    public void Withdraw(int withdraw){
        if(balance > 0){
            balance -= withdraw;
            System.out.printf("- Ban da rut %dđ tu vi!\n", withdraw);
        }
        else{
            System.out.println("Khong the rut tien!");
        }
    }

    @Override
    public String toString(){
        return "- So du trong vi: " + balance + "đ";
    }
}
