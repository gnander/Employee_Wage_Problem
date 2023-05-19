package Employeewage.problem;

public class MonthlyWageCalculation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 4;
        int totalWorkingHours = 0;
        int employeeType = (int) (Math.random() * 2);

        String employeeTypeName;
        int dailyWage = 0;
        int totalWage = 0;

        switch (employeeType) {
            case 0:
                employeeTypeName = "Full-time";
                while (totalWorkingHours < 100) {
                    if (totalWorkingHours + fullDayHours <= 100) {
                        dailyWage = wagePerHour * fullDayHours;
                        totalWorkingHours += fullDayHours;
                    } else {
                        break;
                    }
                    totalWage += dailyWage;
                }
                break;
            case 1:
                employeeTypeName = "Part-time";
                while (totalWorkingHours < 100) {
                    if (totalWorkingHours + partTimeHours <= 100) {
                        dailyWage = wagePerHour * partTimeHours;
                        totalWorkingHours += partTimeHours;
                    } else {
                        break;
                    }
                    totalWage += dailyWage;
                }
                break;
            default:
                employeeTypeName = "Unknown";
                break;
        }

        System.out.println(employeeTypeName);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage: " + totalWage);
    }
}




