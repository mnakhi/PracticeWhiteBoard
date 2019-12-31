package oop;

import java.util.Date;

public class CheckingAccount extends Bank{
    public CheckingAccount(){};

    public CheckingAccount(double balance, Date d){
        super(balance, d);
    }
    @Override
    public boolean logIn(String userName, int password) {
        System.out.println("Hi" + userName + " you have successfully logged in");
        return true;
    }
    @Override
    public void accountOptions() {
        System.out.println("Click here to know about your additional opportunities");
    }

    @Override
    public void addInterestRate(double balance) {
        System.out.println("your balance with added interest rate is "+ (balance+(balance*.06)));
    }

    @Override
    public void applyForCreditCard(double creditScore) {
        if(creditScore>=670){
            System.out.println("You can apply for credit card now");
        }
        else{
            System.out.println("I am sorry, try again later");
        }
    }


}
