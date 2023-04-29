import java.util.Scanner;

public class Account {
    static int totalBankbalance = 10000;
    static int bankBalance = 0;
    public static void debit()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A amount ");
        int withdrawnAmount = sc.nextInt();
        if( withdrawnAmount > totalBankbalance)
        {
            System.out.println("Debit amount exceeded account balance.");
        }else
        {
            System.out.println("Withdrawn succefully ");
            System.out.println("your bank balance is : " + ( totalBankbalance = totalBankbalance - withdrawnAmount));
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome to the Bank");
         debit();


    }


}
