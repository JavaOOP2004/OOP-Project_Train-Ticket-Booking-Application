/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tms;

/**
 *
 * @author Cuong
 */
public class Ticket {
    public static int ID = 1;
    private String ticketNumber;
    private Passenger p;
    private int ticketPrice;
    private String tripnum,coachnum,seatnum;
    private String status;

    public Ticket(Passenger p,String tripnum,String coachnum,String seatnum){
        this.ticketNumber = String.format("%02d", ID++);
        this.p = p;
        this.ticketPrice = 110000;
        this.status = "CHƯA THANH TOÁN";
        this.tripnum=tripnum;
        this.seatnum=seatnum;
        this.coachnum=coachnum;
    }

    public String getTripnum() {
        return tripnum;
    }

    public String getCoachnum() {
        return coachnum;
    }

    public String getSeatnum() {
        return seatnum;
    }

    public void setTripnum(String tripnum) {
        this.tripnum = tripnum;
    }

    public void setCoachnum(String coachnum) {
        this.coachnum = coachnum;
    }

    public void setSeatnum(String seatnum) {
        this.seatnum = seatnum;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void Promotion(Passenger p){
        if(p.getAge() > 0 && p.getAge() <= 10){
            ticketPrice -= (ticketPrice * 25) / 100;
        }
        else if(p.getAge() >= 18 && p.getAge() <= 23 && p.getRole().equals("Sinh viên")){
            ticketPrice -= (ticketPrice * 10) / 100;
        }
        else if(p.getAge() >= 60){
            ticketPrice -= (ticketPrice * 15) / 100;
        }
        else{
            ticketPrice -= 0;
        }
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
