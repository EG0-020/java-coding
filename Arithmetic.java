import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Operator = 0;

    try {
        System.out.print("Enter the First Operand: ");
        String operand1 = sc.next();

        System.out.print("Enter the Second Operand: ");
        String operand2 = sc.next();

        System.out.print("Enter Base (2-16): ");
        int base = sc.nextInt();
        
        if(base > 16 || base < 2){
            System.out.print("Invalid Base. Choose 2-16 Only.");
            return;
        }

    int num1 = Integer.parseInt(operand1, base);
    int num2 = Integer.parseInt(operand2, base);

    System.out.print("Choose among the four operators (+, -, *, /): ");
    char operator = sc.next().charAt(0);

    switch(operator){
        case '+':
            Operator = num1 + num2; break;
        case '-':
            Operator = num1 - num2; break;
        case '*':
            Operator = num1 * num2; break;
        case '/':
            Operator = num1 / num2; break;
        default:
            System.out.println("Unidentified Operation."); return;
        }
    }
    catch (Exception e){
        System.out.println("Wrong Operand for Base."); return;
    }
    System.out.println("The result is: " + Operator);
    }
}