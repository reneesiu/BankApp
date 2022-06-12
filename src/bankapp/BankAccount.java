package bankapp;

import java.awt.event.*;
import javax.swing.*;

public class BankAccount {
    private String Name;
    private double Balance;
    
    public BankAccount(String n) {
        this.Name=n;
        this.Balance=0;
    }
    
    public BankAccount(String n, double b) {
        this.Name=n;
        this.Balance=b;
    }
    
    public void Withdraw(double w) {
        if(w>this.Balance) {
            JOptionPane.showMessageDialog(null, "You don't have enough Balance!!!");
        } 
        else {
            this.Balance-=w;
            JOptionPane.showMessageDialog(null, "Your Withdrawal was successful!!!");
        }
    }
    
    public void Deposit(double d) {
        if (d>1000) {
            JOptionPane.showMessageDialog(null, "You can't do this transaction- Your limit for Deposit is $1000!!!");
        }
        else {
            this.Balance+=d;
            JOptionPane.showMessageDialog(null, "Your Deposit was successful!!!");
        }
    }
    
    public void SetBalance(double b) {
        this.Balance=b;
    }
    
    public String GetName(){
        return this.Name;
    }
    
    public double GetBalace() {
        return this.Balance;
    }
}
