package oop;

import java.util.Date;

public interface AccountCharacteristics {
    public boolean logIn(String userName, int password);
    public double showStatements(Date dt, double balance);
    public double payBills(double amountPay, double amountDue);
    public double transfer(String accountName, double amountTransfer);
}
