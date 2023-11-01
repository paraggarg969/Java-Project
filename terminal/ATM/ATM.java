package ATM;

public class ATM{
    private double balance;
    private double depositeAmount;
    private double withdrawlAmount;

    public void ATM(){

    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setDepositeAmount(double depositeAmount){
        this.depositeAmount = depositeAmount;
    }

    public double getDepositeAmount(){
        return depositeAmount;
    }

    public void setWithdrawAmount(double withdrawlAmount){
        this.withdrawlAmount = withdrawlAmount;
    }

    public double getWithdrawlAmount(){
        return withdrawlAmount;
    }
}