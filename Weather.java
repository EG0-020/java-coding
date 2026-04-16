
import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] wd = new double[3][7];
        double average = 0;

        for (int i = 0; i < wd.length; i++) {
            double total = 0;
            double highest = Double.NEGATIVE_INFINITY;
            System.out.println("City " + (i + 1));

            for (int j = 0; j < wd[i].length; j++) {
                System.out.print("Enter Temperature for Day " + (j + 1) + ": ");
                wd[i][j] = sc.nextDouble();
                total += wd[i][j];
                highest = Math.max(highest, wd[i][j]);
            }
            average = total / 7;
            System.out.println("-----------------------------------");
            System.out.printf("Average Temperature: " + "%.2f \n", average);
            System.out.printf("Highest Temperature: %.2f\n", highest);
            System.out.println();

        }
    }
}
