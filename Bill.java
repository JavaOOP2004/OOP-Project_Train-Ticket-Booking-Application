import java.util.ArrayList;

public class Bill {
    private int original_sum, discount, lastsum;
    private ArrayList<Passenger> p_list;
    private ArrayList<Trip> t_list;

    public Bill(ArrayList<Passenger> p_list, ArrayList<Trip> t_list){
        this.original_sum = 0;
        this.discount = 0;
        this.lastsum = 0;
        this.p_list = p_list;
        this.t_list = t_list;
    }

    public int getOriginal_sum() {
        return original_sum;
    }

    public void setOriginal_sum(int original_sum) {
        this.original_sum = original_sum;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getLastsum() {
        return lastsum;
    }

    public void setLastsum(int lastsum) {
        this.lastsum = lastsum;
    }

    public ArrayList<Passenger> getP_list() {
        return p_list;
    }

    public void setP_list(ArrayList<Passenger> p_list) {
        this.p_list = p_list;
    }

    public ArrayList<Trip> getT_list() {
        return t_list;
    }

    public void setT_list(ArrayList<Trip> t_list) {
        this.t_list = t_list;
    }

    public void PromotionbyAge(){
        for(int i = 0; i < p_list.size(); i++){
            for(int j = 0; j < t_list.size(); j++){
                original_sum += t_list.get(j).getTicketPrice();
                if (p_list.get(i).getAge() > 0 && p_list.get(i).getAge() <= 10) {
                    lastsum += (t_list.get(j).getTicketPrice() - (t_list.get(j).getTicketPrice() * 25) / 100);
                    discount += (t_list.get(j).getTicketPrice() * 25) / 100;
                }
                if (p_list.get(i).getAge() >= 18 && p_list.get(i).getAge() <= 23) {
                    lastsum += (t_list.get(j).getTicketPrice() - (t_list.get(j).getTicketPrice() * 10) / 100);
                    discount += (t_list.get(j).getTicketPrice() * 10) / 100;
                }
                else{
                    lastsum += t_list.get(j).getTicketPrice();
                    discount += 0;
                }
            }
        }
    }

    public void PromotionbySum(){
        if(lastsum >= 300000 && lastsum < 600000){
            discount += (lastsum * 5) / 100;
            lastsum -= (lastsum * 5) / 100;
        }
        if(lastsum >= 600000 && lastsum < 1000000){
            discount += (lastsum * 10) / 100;
            lastsum -= (lastsum * 10) / 100;
        }
        if(lastsum >= 1000000){
            discount += (lastsum * 15) / 100;
            lastsum -= (lastsum * 15) / 100;
        }
    }

    @Override
    public String toString(){
        return "Tong tien ve: " + original_sum + "\n" + "Giam gia: -" + discount + "\n" + "Tong thanh toan: " + lastsum;
    }
}
