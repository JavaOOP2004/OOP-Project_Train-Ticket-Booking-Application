import java.util.ArrayList;

public class Bill {
    private ArrayList<Ticket> tk_list;
    private int original_sum, discount, lastsum, ticketCount;
    private String status;

    public Bill(ArrayList<Ticket> tk_list) {
        this.tk_list = tk_list;
        this.original_sum = 0;
        this.discount = 0;
        this.lastsum = 0;
        this.ticketCount = tk_list.size();
        this.status = "Chua thanh toan";
    }

    public ArrayList<Ticket> getTk_list() {
        return tk_list;
    }

    public void setTk_list(ArrayList<Ticket> tk_list) {
        this.tk_list = tk_list;
    }

    public int getOriginal_sum() {
        return totalPrice(original_sum);
    }

    public void setOriginal_sum(int original_sum) {
        this.original_sum = original_sum;
    }

    public int getDiscount() {
        return getOriginal_sum() - getLastsum();
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getLastsum() {
        return lastPrice(lastsum, original_sum);
    }

    public void setLastsum(int lastsum) {
        this.lastsum = lastsum;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Tính tổng tiền vé theo giá gốc, mặc định là 110000đ không bao gồm giảm giá
    public int totalPrice(int original_sum) {
        for(Ticket t : tk_list) {
            original_sum += t.getTicketPrice();
        }
        return original_sum;
    }

    // Tính số tiền cần thanh toán, bao gồm cả giảm giá
    public int lastPrice(int lastsum, int original_sum){
        lastsum = totalPrice(original_sum);

        // Giảm giá dựa trên tổng chi phí nhất định
        if(lastsum >= 300000 && lastsum < 600000){
            lastsum -= (lastsum * 5) / 100;
        }
        else if(lastsum >= 600000 && lastsum < 1000000){
            lastsum -= (lastsum * 10) / 100;
        }
        else if(lastsum >= 1000000){
            lastsum -= (lastsum * 15) / 100;
        }

        return lastsum;
    }

    @Override
    public String toString(){
        String temp = "";
        if(getOriginal_sum() >= 300000 && getOriginal_sum() < 600000){
            temp += "đ (-5%)";
        }
        else if(getOriginal_sum() >= 600000 && getOriginal_sum() < 1000000){
            temp += "đ (-10%)";
        }
        else if(getOriginal_sum() >= 1000000){
            temp += "đ (-15%)";
        }
        else temp += "đ";

        return "- So luong ve: " + ticketCount + "\n"
                + "- Tong tien ve: " + getOriginal_sum() + "đ" + "\n"
                + "- Giam gia: -" + getDiscount() + temp + "\n"
                + "- Tong thanh toan: " + getLastsum() + "đ" + "\n"
                + "- Trang thai: " + status;
    }
}
