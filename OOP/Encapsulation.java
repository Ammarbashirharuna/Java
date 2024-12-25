package OOP;
/*
this is the encapsolation file that hide some data to the main file in the run time
 */

public class Encapsulation {
    public static void main(String[] args) {
        int baseSalary = 5_000;
        int hourlyRate = 10;
        int totalHours = 20;

        int wage = calculateWage(baseSalary, hourlyRate, totalHours);
        System.out.println(wage);
    }

    public static int calculateWage(int baseSalary, int hourlyRate, int totalHours) {
        return baseSalary + (hourlyRate * totalHours);
        
    }
}
