import java.util.Scanner;

public class Payment {
    private Bill b;
    private Wallet w;

    public Payment(Bill b, Wallet w) {
        this.b = b;
        this.w = w;
    }

    public Bill getB() {
        return b;
    }

    public void setB(Bill b) {
        this.b = b;
    }

    public Wallet getW() {
        return w;
    }

    public void setW(Wallet w) {
        this.w = w;
    }

    // Tiến hành quá trình thanh toán
    public void makePayment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Xac nhan thanh toan hoa don?");
        System.out.println("Dong y: Nhan 1");
        System.out.println("Thoat: Nhan 2");
        int select = sc.nextInt();
        if(select == 1){
            while(w.getBalance() < b.getLastsum()){
                System.out.println("SO DU KHONG DU!");
                System.out.println("Vi cua ban co: " + w.getBalance() + "đ");
                System.out.println("Tiep tuc nap: Nhan 1");
                System.out.println("Thoat: Nhan 2");
                int choose = sc.nextInt();
                if(choose == 1){
                    System.out.print("So tien can nap: ");
                    int deposit = sc.nextInt();
                    w.setBalance(w.getBalance() + deposit);
                }
                else if(choose == 2){
                    return;
                }
            }
            w.setBalance(w.getBalance() - b.getLastsum());
            System.out.println("THANH TOAN THANH CONG!");
            System.out.println("Vi cua ban co: " + w.getBalance() + "đ");
            b.setStatus("Da thanh toan");
        }
        else if(select == 2){
            return;
        }
    }
}
