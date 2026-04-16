
class E {

    String employeeID;
    String name;
    double hourlyWage;
    double hoursWorked;

    E(String EmployeeID, String Name, double HourlyWage, double HoursWorked) {
        employeeID = EmployeeID;
        name = Name;
        hourlyWage = HourlyWage;
        hoursWorked = HoursWorked;
    }

    double calculateSalary(double hourlyWage, double hoursWorked) {
        return hourlyWage * hoursWorked;
    }

    void displayEmployeeDetails() {
        System.out.println("ID: " + employeeID + ", Name: " + name + ", Wage: " + hourlyWage + ", Hours Worked: " + hoursWorked + ", Salary: " + calculateSalary(hourlyWage, hoursWorked));
    }
}

public class PayrollSystem {

    public static void main(String[] args) {
        E E1 = new E("E001", "Alice Go", 150.0, 40.0);
        E E2 = new E("E002", "Bob Hann", 78.0, 50.0);
        E E3 = new E("E003", "Mik Mik", 350.0, 20.0);
        E E4 = new E("E004", "Bi Bi", 150.0, 40.0);

        System.out.println("Employee 1:");
        System.out.println("ID:" + E1.employeeID);
        System.out.println("Name::" + E1.name);
        System.out.println("Hourly Wage:" + E1.hourlyWage);
        System.out.println("Hours Worked:" + E1.hoursWorked);
        System.out.println(" \n");

        System.out.println("Employee 2:");
        System.out.println("ID:" + E2.employeeID);
        System.out.println("Name::" + E2.name);
        System.out.println("Hourly Wage:" + E2.hourlyWage);
        System.out.println("Hours Worked:" + E2.hoursWorked);
        System.out.println(" \n");

        System.out.println("Employee 3:");
        System.out.println("ID:" + E3.employeeID);
        System.out.println("Name::" + E3.name);
        System.out.println("Hourly Wage:" + E3.hourlyWage);
        System.out.println("Hours Worked:" + E3.hoursWorked);
        System.out.println(" \n");

        System.out.println("Employee 4:");
        System.out.println("ID:" + E4.employeeID);
        System.out.println("Name::" + E4.name);
        System.out.println("Hourly Wage:" + E4.hourlyWage);
        System.out.println("Hours Worked:" + E4.hoursWorked);
        System.out.println(" \n");

        System.out.println("Calculating salaries...");
        System.out.println("Employee Details");
        E1.displayEmployeeDetails();
        E2.displayEmployeeDetails();
        E3.displayEmployeeDetails();
        E4.displayEmployeeDetails();
    }
}
