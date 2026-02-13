import java.util.Scanner;

public class Attendance {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         int num = 0;
         int presentCount = 0;
         int absentCount = 0;
         int student = 0;

         while(true){
            System.out.print("Enter the total number of Students: ");
            if(sc.hasNextInt()){
                    student = sc.nextInt();break;
            }else{
                System.out.println("Enter Numbers Only!");
                sc.next();
            }
        }
         for(num = 1; num <= student; num++){
             System.out.print("Is student " + num + " present? (Y/N): ");
             char status = sc.next().toUpperCase().charAt(0);
                if(status == 'Y'){
                    presentCount++;
                }
                else if(status == 'N'){
                    absentCount++; 
                }
                else{
                    System.out.println("Enter only Y or N."); num--;
                } 
            }
        System.out.println("-----------------------------");
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);
    }     
}

