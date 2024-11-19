public class Trip {
    public static int ID = 1;
    private String tripNumber, departureStation, arrivalStation, date, time;
    private int coachNumber, seatNumber;

    public Trip(String departureStation, String arrivalStation, String date, String time, int coachNumber, int seatNumber) {
        this.tripNumber = String.format("TRIP%03d", ID++);
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.date = date;
        this.time = time;
        this.coachNumber = coachNumber;
        this.seatNumber = seatNumber;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCoachNumber() {
        return coachNumber;
    }

    public void setCoachNumber(int coachNumber) {
        this.coachNumber = coachNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "- Chuyen tau so: " + tripNumber + "\n"
                + "- Hanh trinh: " + departureStation + " - " + arrivalStation + "\n"
                + "- Ngay di: " + date + "\n"
                + "- Gio di: " + time + "\n"
                + "- Toa: " + coachNumber + "\n"
                + "- Ghe so: " + seatNumber;
    }
}
