package bankapp;

import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;

public class BankApp {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        double balance;
        double withdraw;
        double deposit;
        //Test1
        System.out.println("Bank System App - ONLINE");
        System.out.println("========================\n");
        //System.out.print("Enter name of Account owner ==> ");
        name=JOptionPane.showInputDialog("Enter the name of Account owner");
        BankAccount b1=new BankAccount(name);
        //Test constructor
        System.out.println("\nAccount owner ==> "+b1.GetName());
        System.out.println("Balance ==> "+b1.GetBalace());
        //Test setBalance
        //System.out.print("Enter initial Balance ==> ");
        //balance=s.nextDouble();
        balance=Double.parseDouble(JOptionPane.showInputDialog("Enter Initial Balance"));
        b1.SetBalance(balance);
        System.out.println("Balance after initial Deposit ==> "+b1.GetBalace());
        //Test Withdraw
        System.out.print("Withdraw - How much do you want to withdraw ==> ");
        withdraw=s.nextDouble();
        b1.Withdraw(withdraw);
        System.out.println("Balance after withdrawal ==> "+b1.GetBalace());
        //Test Deposit
        System.out.print("Deposit - How much do you want to deposit ==> ");
        deposit=s.nextDouble();
        b1.Deposit(deposit);
        System.out.println("Balance after deposit ==> "+b1.GetBalace());
        
        //Test 2
        s.nextLine();
        System.out.println("\n\nBank System App - Branch Office");
        System.out.println("========================\n");
        System.out.print("Enter name of Account owner ==> ");
        name=s.nextLine();
        System.out.print("Enter initial Balance ==> ");
        balance=s.nextDouble();
        BankAccount b2=new BankAccount(name, balance);
        //Test constructor
        System.out.println("\nAccount owner ==> "+b2.GetName());
        System.out.println("Balance ==> "+b2.GetBalace());
        //Test Withdraw
        System.out.print("Withdraw - How much do you want to withdraw ==> ");
        withdraw=s.nextDouble();
        b2.Withdraw(withdraw);
        System.out.println("Balance after withdrawal ==> "+b2.GetBalace());
        //Test Deposit
        System.out.print("Deposit - How much do you want to deposit ==> ");
        deposit=s.nextDouble();
        b2.Deposit(deposit);
        System.out.println("Balance after deposit ==> "+b2.GetBalace());
        
    }
    
}
