package oop;

import java.util.Date;

public abstract class Bank implements AccountCharacteristics{
    private double balance;
    private Date d;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }
    public Bank(){};

    public Bank(double balance, Date d) {
        this.balance = balance;
        this.d = d;
    }

    @Override
    public double showStatements(Date dt, double balance) {
        System.out.println(dt + "=>"+ balance);
        return balance;
    }

    @Override
    public double payBills(double amountPay, double amountDue) {
        double remainingDue = amountDue - amountPay;
        System.out.println("Your current due is "+ remainingDue);
        return remainingDue;
    }
    public double payBills(String accountName, double amountPay, double amountDue){
        double remainingDue = amountDue - amountPay;
        System.out.println("Your current due is "+remainingDue + " dollars to "+accountName);
        return remainingDue;
    }

    @Override
    public double transfer(String accountName, double amountTransfer) {
        System.out.println("Transfer"+ amountTransfer + " to "+ accountName);
        return amountTransfer;
    }
    public abstract void accountOptions();
    public abstract void addInterestRate(double balance);
    public abstract void applyForCreditCard(double creditScore);
}
