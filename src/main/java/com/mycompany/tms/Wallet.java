/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tms;

/**
 *
 * @author Cuong
 */
public class Wallet {
    private int balance;

    public Wallet() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void Deposit(int deposit){
        this.balance += deposit;
    }

    public void Withdraw(int withdraw){
        if(balance > 0){
            this.balance -= withdraw;
        }
        else{
        }
    }
}
