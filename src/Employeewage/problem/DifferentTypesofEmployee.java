package Employeewage.problem;

public class DifferentTypesofEmployee {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 4;

        int employeeType = (int) (Math.random() * 2);

        int dailyWage;
        if (employeeType == 0) {
            dailyWage = wagePerHour * fullDayHours;
            System.out.println("Full-time");
        } else {
            dailyWage = wagePerHour * partTimeHours;
            System.out.println("Part-time");
        }

        System.out.println("Daily Employment Wage: " + dailyWage);
    }

}
