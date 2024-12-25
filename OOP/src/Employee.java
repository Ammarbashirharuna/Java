public class Employee {
    public int baseSalary;
    public int hourlyRate;


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);

    }
/*
setter and getters throw exception if the employee salary is not number that above 1
 */
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Sorry the employe can not be salary can not be empty");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
}
