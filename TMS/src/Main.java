import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Passenger> p_list = new ArrayList<>();
        ArrayList<Trip> t_list= new ArrayList<>();
        ArrayList<Ticket> tk_list = new ArrayList<>();
        ArrayList<Ticket> buyedTicket = new ArrayList<>();
        Wallet w = new Wallet();
        Option op = new Option(p_list, t_list, tk_list, buyedTicket);

        // Nhập dữ liệu hành khách, chuyến đi và vé
        Passenger p1 = new Passenger("123456784321", "Nguyen Van A", 20, "Sinh vien", "nguyenvana@gmail.com", "7364890432");
        Passenger p2 = new Passenger("635482978172", "Nguyen Van B", 20, "Cong nhan", "nguyenvanb@gmail.com", "7625017825");

        Trip t1 = new Trip("Ga Ha Noi", "Ga Hai Phong", "19/11/2024", "6:10", 6, 40);
        Trip t2 = new Trip("Ga Hai Phong", "Ga Ha Noi", "19/11/2024", "15:15", 6, 40);

        Ticket tk1 = new Ticket(p1, t1);
        Ticket tk2 = new Ticket(p1, t2);
        Ticket tk3 = new Ticket(p2, t1);
        Ticket tk4 = new Ticket(p2, t2);

        // Thêm vé, xem danh sách vé và xem hóa đơn
        op.addTicket(tk1);
        op.addTicket(tk2);
        op.addTicket(tk3);
        op.addTicket(tk4);
        op.seeTicket();
        op.seeBill();

        // Xóa vé, xem lại danh sách vé và hóa đơn
        System.out.println();
        op.removeTicket(tk4);
        op.removeTicket(tk1);
        op.seeTicket();
        op.seeBill();

        // Xem ví, cập nhật ví và thanh toán
        System.out.println();
        op.seeWallet(w);
        op.UpdateBalance(w);
        op.seeWallet(w);
        op.makePayment(w);

        // Xem lại danh sách vé đã tạo sau khi thanh toán các vé trước đó
        System.out.println();
        op.seeTicket();

        // Xem danh sách vé đã mua
        System.out.println();
        op.seePucharsedBill();

        // Thêm vé mới và hóa đơn
        System.out.println();
        op.addTicket(tk1);
        op.seeTicket();
        op.seeBill();
    }
}
