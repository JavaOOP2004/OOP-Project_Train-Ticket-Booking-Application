public class Ticket {
    public static int ID = 1;
    private String ticketNumber;
    private Passenger p;
    private Trip t;
    private int ticketPrice;
    private String status;

    public Ticket(Passenger p, Trip t){
        this.ticketNumber = String.format("%02d", ID++);
        this.p = p;
        this.t = t;
        this.ticketPrice = 110000;
        this.status = "Chua thanh toan";
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Passenger getP() {
        return p;
    }

    public void setP(Passenger p) {
        this.p = p;
    }

    public Trip getT() {
        return t;
    }

    public void setT(Trip t) {
        this.t = t;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Giảm giá theo độ tuổi và vai trò
    public int PromotionbyAge(Passenger p, int ticketPrice){
        if(p.getAge() > 0 && p.getAge() <= 10){
            ticketPrice -= (ticketPrice * 25) / 100;
        }
        else if(p.getAge() >= 18 && p.getAge() <= 23 && p.getRole().equals("Sinh vien")){
            ticketPrice -= (ticketPrice * 10) / 100;
        }
        else if(p.getAge() >= 60){
            ticketPrice -= (ticketPrice * 15) / 100;
        }
        else{
            ticketPrice -= 0;
        }
        return ticketPrice;
    }

    public int getTicketPrice() {
        return PromotionbyAge(p, ticketPrice);
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString(){
        String temp = "";
        if(p.getAge() > 0 && p.getAge() <= 10){
            temp += getTicketPrice() + "đ (-25%)";
        }
        else if(p.getAge() >= 18 && p.getAge() <= 23 && p.getRole().equals("Sinh vien")){
            temp += getTicketPrice() + "đ (-10%)";
        }
        else if(p.getAge() >= 60){
            temp += getTicketPrice() + "đ (-15%)";
        }
        else{
            temp += getTicketPrice() + "đ";
        }
        return "* Ve so: " + ticketNumber + "\n"
                + p + "\n"
                + t + "\n"
                + "- Gia ve: " + temp + "\n"
                + "- Trang thai: " + status;
    }
}
