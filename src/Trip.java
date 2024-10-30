public class Trip {
    private String trainNumber , departureStation , arrivalStation , date , time , status;
    private int ID , coachNumber , seatNumber , ticketPrice ;

    public Trip(String trainNumber, String departureStation, String arrivalStation, String date, String time, String status, int ID, int coachNumber, int seatNumber, int ticketPrice) {
        this.trainNumber = trainNumber;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.date = date;
        this.time = time;
        this.status = status;
        this.ID = ID;
        this.coachNumber = coachNumber;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public int getID() {
        return ID;
    }

    public int getCoachNumber() {
        return coachNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCoachNumber(int coachNumber) {
        this.coachNumber = coachNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
}
