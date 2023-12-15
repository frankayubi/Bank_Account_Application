package bankaccountapp;

public interface IBaseRate {

    //Write a metod that returns the base rate 
    default double getBaseRate(){
        return 2.5;
        
    }

    
}
