package Employeewage.problem;

public class DailyWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int minHours = 0;
        int maxHours = 8;

        int randomHours = (int) (Math.random() * (maxHours - minHours + 1)) + minHours;

        int dailyWage = randomHours * wagePerHour;

        System.out.println("Randomly Generated Hours: " + randomHours);
        System.out.println("Daily Employment Wage: " + dailyWage);
    }
}
