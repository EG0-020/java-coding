import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        System.out.println(message);
    }
}

public class BankingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100000;
        

        try {
            System.out.print("Enter the amount to withdraw: ");
            int amount = sc.nextInt();

            if (amount > balance || amount <= 0) {
                throw new InsufficientFundsException("!!! An unexpected error occurred!!!");
            }
            balance -= amount;
            System.out.println("Withdrawal successful!! \nCurrent balance: " + balance);
        } catch (Exception e) {
           System.err.println("!!! Withdrawal failed. Amount is invalid or exceeds balance.!!! \nCurrent balance: " + balance);      
        }
    }
 }
