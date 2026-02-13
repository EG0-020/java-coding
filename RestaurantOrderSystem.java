import java.util.Scanner;

public class RestaurantOrderSystem{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int menu;
        int quantity;
        int price = 0;
        String item = "";

        System.out.println("MENU");
        System.out.println("1. Burger   \t- PHP 100");
        System.out.println("2. Fries    \t- PHP 50");
        System.out.println("3. Soda     \t- PHP 30");
        System.out.println("4. Ice Cream\t- PHP 45");
        System.out.println("5. Exit\n");

        System.out.print("Enter the menu number of your choice: ");
        menu = sc.nextInt();

        switch(menu){
            case 1: 
                item = "Burger";
                price = 100;
                break;
            case 2:
                item = "Fries";
                price = 50;
                break;
            case 3:
                item = "Soda";
                price = 30;
                break;
            case 4:
                item ="Ice Cream";
                price = 45;
                break;
            case 5:
                System.out.print("Exit");
                return;
            default:
                System.out.println("Order number unavailable.");
                return;
        }
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();

        int totalamount = price*quantity;
        System.out.println("You ordered " + item + ".");
        System.out.println("Total Amount: " + totalamount + "PHP");
        }
} 
