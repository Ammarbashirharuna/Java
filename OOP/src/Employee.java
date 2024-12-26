public class Employee {
    private int baseSalary;
    private int hourlyRate;


    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);

    }


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);

    }
/*
setter and getters throw exception if the employee salary is not number that above 1
 */
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Sorry the employee can not be salary can not be empty");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Sorry the hourly rate can not be empty as well");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
