package bankaccountapp;

public class Checking extends Account {
//list properties specific to a checking account
private int debitCardNumber;
private int debitCardPin;

//constructor to initialize checking account properties
public Checking(String name,String sSN, double initDeposit){
    super(name, sSN,initDeposit);
    accountNumber = "2" + accountNumber;
    setDebitCard();

    
}

@Override
public void setRate(){
    rate = getBaseRate() * .15;
}

private void setDebitCard(){
    debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
    debitCardPin = (int) (Math.random() * Math.pow(10, 4));        
}

// List any methods specific to the checking account

public void showInfo(){
    super.showInfo();
    System.out.println("Your Checking Account Features" +
    "\nDebit Card Number: " + debitCardNumber +
    "\nDebit Card Pin " + debitCardPin);
}
public void deposit(double amount){
    super.deposit(amount);
    System.out.print(" in Checking Account\n" );
    printBalance();
}
public void withdraw(double amount){
    super.withdraw(amount);
    System.out.print(" from Checking Account\n" );
    printBalance();
}
public void transfer(String toWhere , double amount){
   super.transfer(toWhere ,amount);
    System.out.print(" Checking Account\n" );
    printBalance();
}


}