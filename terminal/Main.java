import ATM.OperationImpl.OperationImpl;
import ATM.OperationInterf.OperationInterf;
import java.util.*;

public class Main {
    public static void main(String args[]){
        OperationInterf op = new OperationImpl();
        int atmnumber = 123456789;
        int pinnumber = 12345;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to ATM Machine !!!\n");
        System.out.print("Enter your ATM number : ");
        int atmnu = sc.nextInt();
        System.out.print("Enter your PIN : ");
        int pin = sc.nextInt();
        System.out.println();

        if((atmnumber==atmnu)&&(pinnumber==pin)){
            while(true){
                System.out.println("Available Services : ");
                System.out.println("1. View Available Balance \n2. Withdraw Amount \n3. Deposite Amount \n4. View Mini Statement \n5. Exit \n");
                System.out.print("Enter your Choice : ");
                int ch = sc.nextInt();
                System.out.println();

                if(ch==1){
                    op.viewBalance();
                    System.out.println();
                }
                else if(ch==2){
                    System.out.print("Enter amount you want to Withdraw : ");
                    double withdrawlAmount = sc.nextDouble();
                    op.Withdrawamount(withdrawlAmount);
                    System.out.println();
                }
                else if(ch==3){
                    System.out.print("Enter the amount you want to Deposite : ");
                    double depositeAmount = sc.nextDouble();
                    op.depositeamount(depositeAmount);
                    System.out.println();
                }
                else if(ch==4){
                    System.out.println("Your mini Statement is : ");
                    op.viewStatement();
                    System.out.println();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM card\nThank you for using ATM Machine!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM Number or PIN");
        }
    }
}
