package Employeewage.problem;

public class MonthlyWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 4;
        int workingDaysPerMonth = 20;

        int employeeType = (int) (Math.random() * 2);

        int dailyWage;
        int monthlyWage;
        String employeeTypeName;

        switch (employeeType) {
            case 0:
                employeeTypeName = "Full-time";
                dailyWage = wagePerHour * fullDayHours;
                break;
            case 1:
                employeeTypeName = "Part-time";
                dailyWage = wagePerHour * partTimeHours;
                break;
            default:
                employeeTypeName = "Unknown";
                dailyWage = 0;
                break;
        }

        monthlyWage = dailyWage * workingDaysPerMonth;

        System.out.println("Employee Type: " + employeeTypeName);
        System.out.println("Daily Employment Wage: " + dailyWage);
        System.out.println("Monthly Employment Wage: " + monthlyWage);
    }
}