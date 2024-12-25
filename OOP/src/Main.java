public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.hourlyRate = 50_000;
        employee.baseSalary = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);




    }




}