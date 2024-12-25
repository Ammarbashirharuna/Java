public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.hourlyRate = 50_000;
        employee.baseSalary = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
//        calling the method from the class
        var emp = new Employee();
        emp.hourlyRate = 10_000;
        emp.baseSalary = 10;
        int wag = emp.calculateWage(30);
        System.out.println(wag);





    }




}