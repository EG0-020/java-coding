import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        System.out.println(message);
    }
}
public class ShoppingOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String item = "Wireless Earbuds";
        int StockAvailable = 50; 
        double price = 99.87;

        System.out.println("Product: " + item);
        System.out.println("Price: ----------- $" + price);
        System.out.println("Stock Available: --" + StockAvailable );
        System.out.println();

        while(true){
            try {
                System.out.print("Enter the quantity you want to purchase: ");
                int quantity = sc.nextInt();
                if(quantity > StockAvailable || quantity <= 0){
                    throw new InvalidQuantityException ("!!!An unexpected error occurred!!!");
                }
                double TotalAmount = price * quantity;
                System.out.println("Total Amount: $" + TotalAmount);
                System.out.println("Purchase successful! Thank you for shopping with us.");
                break;
            } catch (InvalidQuantityException e) {
                System.out.println("Purchased quantity exceeds stock available or is invalid. Please enter a valid quantity."); 
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid quantity.");
                sc.nextLine();
            }
        }
    }
}