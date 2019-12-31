package oop;

public class SavingsAccount extends Bank{
    @Override
    public boolean logIn(String userName, int password) {
        System.out.println("Hi enter valid username and password");
        return false;
    }
    @Override
    public void accountOptions() {
        System.out.println("Get more benefits by enrolling in our new program. Click here to know more");
    }

    @Override
    public void addInterestRate(double balance) {
        System.out.println("Your balance with the added interest rate is "+(balance+(balance*0.09)));
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
