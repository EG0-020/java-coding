import java.util.Scanner;

public class BitWiseCalculator{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Operator = 0;

        try {
            System.out.print("Enter the first decimal: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second decimal: ");
            int num2 = sc.nextInt();

            System.out.print("Choose among the five operators (&, |, ^, <<, >>): ");
            String operator = sc.next();

            switch(operator){

                case "&":
                Operator = num1 & num2; break;
                case "|":
                Operator = num1 | num2; break;
                case "^":
                Operator = num1 ^ num2; break;
                case "<<":
                Operator = num1 << num2; break;
                case ">>":
                Operator = num1 >> num2; break;
                default:
                System.out.println("Unidentified Operation"); return;
            }
        }
        catch (Exception e){
            System.out.println("Incorrect Input."); return;
        }
            System.out.println("------------------------ ");
            System.out.println("The result is " + Operator);
    }
}