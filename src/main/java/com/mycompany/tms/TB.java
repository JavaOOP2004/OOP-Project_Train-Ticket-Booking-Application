/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tms;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Cuong
 */
public class TB {
    public static ArrayList<Passenger> p_list = new ArrayList<>();
    public static ArrayList<Trip> t_list= new ArrayList<>();
    public static ArrayList<Ticket> tk_list = new ArrayList<>();
    public static Wallet w = new Wallet();
    public static void main(String[] args) {
        new Welcome().setVisible(true);
    }
}
