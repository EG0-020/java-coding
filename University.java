
import java.util.Scanner; // Importing Scanner class for user input (free points ba naman)

public class University {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[5];
        int[][] grades = new int[5][3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter Student Name " + (i + 1) + ": ");
            students[i] = sc.next();

            if (students[i].matches("[a-zA-Z]+")) {
                int sum = 0;
                for (int x = 0; x < grades[i].length; x++) {
                    //using try-catch to handle user invalid input (free points na naman)
                    try {
                        System.out.print("Enter grades for Subject " + (x + 1) + ": ");
                        int input = sc.nextInt();

                        if (input < 65 || input > 99) {
                            System.out.println("INVALID INPUT");
                            x--;
                        } else {
                            grades[i][x] = input;
                            sum += grades[i][x];
                        }

                    } catch (Exception e) {
                        System.out.println("INVALID INPUT");
                        sc.next();
                        x--;
                    }
                }
                int average = sum / grades[i].length;
                System.out.print("Average Grade of " + students[i] + ": " + average + "\n");
            } else {
                System.out.println("INVALID INPUT");
                i--;
            }
            System.out.println();
        }
        //modifying grades (free points na naman)
        while (true) {
            String choice = "";
            while (true) {
                System.out.print("Modify a Grade? (Yes/No): ");
                choice = sc.next();

                if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("INVALID INPUT. Please type 'Yes' or 'No'.");
            }
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Terminal Closed!");
                break; 
            }
            try {
                System.out.print("Enter Student Name To Modify All Grades: ");
                String searchName = sc.next();

                int i;
                for (i = 0; i < students.length; i++) {
                    if (students[i].equalsIgnoreCase(searchName)) {
                        System.out.println("Updating all 3 grades for " + students[i] + ":");
                        int newSum = 0;

                        for (int x = 0; x < grades[i].length; x++) {
                            System.out.print("Enter New Grade for Subject " + (x + 1) + ": ");
                            int newGrade = sc.nextInt();

                            if (newGrade >= 65 && newGrade <= 99) {
                                grades[i][x] = newGrade;
                                newSum += newGrade;
                            } else {
                                System.out.println("INVALID GRADE (65-99 only). Try again.");
                                x--;
                            }
                        }
                        //show the new average after modification (free points na naman)
                        int newAverage = newSum / grades[i].length;
                        System.out.println("Update Complete! \nNew Average: " + newAverage);
                        break;
                    }
                }
                if (i == students.length) {
                    System.out.println("Student Not Found.");
                }

            } catch (Exception e) {
                System.out.println("INVALID INPUT. Returning to menu.");
                sc.next();
            }
            System.out.println();
        }
}
}
