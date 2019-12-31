package oop;

import java.util.Date;

public class TestAccounts {
    public static void main(String[] args) {
        CheckingAccount ck1 = new CheckingAccount();
        //ck1.addInterestRate(12000.00);
        ck1.setBalance(12720.0);
        ck1.setD(new Date(2019,11,29));
       // System.out.println(ck1.getD());
       // System.out.println(ck1.getBalance());
        //ck1.applyForCreditCard(600);

        Bank b1 = new SavingsAccount();
       // b1.payBills("amazon.com",13.50,15.00);
        //b1.transfer("PNT",1000.00);
        //b1.showStatements(new Date(),11000);

        SavingsAccount s1 = new SavingsAccount();
        s1.setBalance(20000);
        s1.setD(new Date());
        double balance = s1.getBalance();
        Date date = s1.getD();
        System.out.println("As of "+ date + " your balance is "+ balance);

    }
}
