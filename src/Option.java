import java.util.ArrayList;
import java.util.Scanner;

public class Option {
    private ArrayList<Passenger> p_list;
    private ArrayList<Trip> t_list;
    private ArrayList<Ticket> tk_list;
    private ArrayList<Ticket> buyedTicket;

    public Option(ArrayList<Passenger> p_list, ArrayList<Trip> t_list, ArrayList<Ticket> tk_list, ArrayList<Ticket> buyedTicket) {
        this.p_list = p_list;
        this.t_list = t_list;
        this.tk_list = tk_list;
        this.buyedTicket = buyedTicket;
    }

    // Thêm khách và xóa khách
    public void addPassenger(Passenger p){
        p_list.add(p);
    }

    public void removePassenger(Passenger p){
        p_list.remove(p);
    }

    // Thêm chuyến đi và xóa chuyến đi
    public void addTrip(Trip t){
        t_list.add(t);
    }

    public void removeTrip(Trip t){
        t_list.remove(t);
    }

    // Thêm vé, xóa vé và xem vé đã được thêm
    public void addTicket(Ticket tk){
        tk_list.add(tk);
    }

    public void removeTicket(Ticket tk){
        tk_list.remove(tk);
    }

    public void seeTicket(){
        System.out.println("Danh sach ve da them: ");
        if(tk_list.size() == 0){
            System.out.println("0 co ve nao");
        }
        else{
            for(Ticket i : tk_list){
                System.out.println(i);
                System.out.println();
            }
        }
    }

    // Xem hóa đơn dựa trên vé đã đươợc thêm lần gần nhất
    public void seeBill(){
        Bill b = new Bill(tk_list);
        System.out.println("Hoa don: ");
        System.out.println(b);
    }

    // Xem ví và cập nhật ví
    public void seeWallet(Wallet w){
        System.out.println(w);
    }

    public void UpdateBalance(Wallet w){
        System.out.println("- Nap tien: Nhan 1");
        System.out.println("- Rut tien: Nhan 2");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        if(select == 1){
            System.out.printf("Nhap o tien can nap: ");
            int deposit = sc.nextInt();
            w.Deposit(deposit);
        }
        else if(select == 2){
            int withdraw = sc.nextInt();
            System.out.printf("Nhap o tien can rut: ");
            w.Withdraw(withdraw);
        }
    }

    // Thanh toán
    public void makePayment(Wallet w){
        Bill b = new Bill(tk_list);
        Payment pm = new Payment(b, w);
        pm.makePayment();
        System.out.println(b);
        if(b.getStatus().equals("Da thanh toan")){
            for(Ticket i : tk_list){
                i.setStatus("Da thanh toan");
                buyedTicket.add(i);
            }
            tk_list.clear();
        }
    }

    // Xem danh sach vé đã thanh toán
    public void seePucharsedBill(){
        System.out.println("Danh sach ve da mua: ");
        for(Ticket i : buyedTicket){
            System.out.println(i);
        }
    }
}
