package bankaccountapp;

public class Savings extends Account {
    //list properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize settings for the savings properties
    public Savings(String name,String sSN, double initDeposit){
        super(name,sSN ,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() -.25;
    }
    
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));        
    }


    //List any methods specific to savings accounts
    public void showInfo(){
        super.showInfo();
        System.out.println(
            "Your Savings Account Features" +
            "\nSafety Deposit Box ID: " + safetyDepositBoxID +
            "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
    public void deposit(double amount){
        super.deposit(amount);
        System.out.print(" in Savings Account\n" );
        printBalance();
    }
    public void withdraw(double amount){
        super.withdraw(amount);
        System.out.print(" from Savings Account\n" );
        printBalance();
    }
    public void transfer(String toWhere , double amount){
       super.transfer(toWhere ,amount);
        System.out.print(" Savings Account\n" );
        printBalance();
    }

    
}
