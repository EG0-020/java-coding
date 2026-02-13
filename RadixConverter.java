import java.util.Scanner;

public class RadixConverter{
    public static void main(String[] args) {
        Scanner rad = new Scanner(System.in);

        while (true) { 
                System.out.print("Enter Origin Base (2-16) or STOP to end the program: ");
                String base = rad.nextLine();
                int num = 0;

            if(base.equalsIgnoreCase("STOP")){
                    System.out.print("Program terminated");
                    break;
            }
            try {
                num = Integer.parseInt(base);
                if (num < 2 || num > 16){
                    System.out.println("Invalid base. Please enter base between 2 and 16 only.");
                    continue;
                }    
            } 
            catch (Exception e){
                System.out.println("Invalid Base Input Base Between 2 and 16 or STOP.");
                continue;
            }
            System.out.print("Enter Number in Base " + num + ":");
            String nextBase = rad.nextLine();
            try {
                int radix = Integer.parseInt(nextBase, num); 
                System.out.println("\nConversions of " + nextBase + " (Base " + base + "):");
                for(int rad1 = 2; rad1 <= 16; rad1++){
                    String convert = Integer.toString(radix, rad1).toUpperCase();
                    System.out.println("Base  " + rad1 + ": " + convert);
                }
            } catch (Exception e) {
                System.out.println("Invalid number for base " + num + ". Please try again.");
            }
        }
    
    }   
}