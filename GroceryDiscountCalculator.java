import java.util.Scanner;

public class GroceryDiscountCalculator {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        System.out.print("Enter Amount: ");
        double dsc = p.nextDouble();
        double atp = 0.00;

        if(dsc > 10000){
            atp = 0.15;
        }
        else if(dsc >= 5001 && dsc <= 10000){
            atp = 0.10;
        }
        else if(dsc >= 1000 && dsc <= 5000){
            atp = 0.10;
        }
        else if(dsc < 1000){
            atp = 0.00;
        }
        else{
            System.out.println("Invalid Input");
        }
        double fp = dsc - (dsc * atp);

        System.out.print("Discount Rate: Php" + (atp * 100) + "%\n");
        System.out.printf("Final Price: Php%.2f",fp);

        p.close();
    }
}
