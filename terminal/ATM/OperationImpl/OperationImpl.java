package ATM.OperationImpl;
import java.util.*;
import ATM.OperationInterf.OperationInterf;
import ATM.*;

public class OperationImpl implements OperationInterf {
    ATM atm = new ATM();
    Map<Double,String> ministat = new HashMap<>();

    public void viewBalance(){
        System.out.println("Available balance is : "+atm.getBalance());
    }

    public void Withdrawamount(double withdrawlAmount){
        if(withdrawlAmount <= atm.getBalance()){
            ministat.put(withdrawlAmount," -> Amount Withdraw");
            System.out.println("Collect your Cash : "+withdrawlAmount);
            atm.setBalance(atm.getBalance()-withdrawlAmount);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Amount");
        }
    }

    public void depositeamount(double depositeAmount){
        ministat.put(depositeAmount," -> Amount Deposited");
        System.out.println("Rs "+depositeAmount+" Deposite Successfully!!");
        atm.setBalance(atm.getBalance()+depositeAmount);
        viewBalance();
    }

    public void viewStatement(){
        for(Map.Entry<Double,String> m:ministat.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
