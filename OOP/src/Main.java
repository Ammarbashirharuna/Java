public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setHourlyRate(50_000);
        employee.setBaseSalary(10);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
//        calling the method from the class
//        var emp = new Employee();
//        emp.getHourlyRate();
//        emp.getBaseSalary();
//        int wag = emp.calculateWage(30);
//        System.out.println(wag);
//      calling another methods from admin class
        var admin = new Admin();
        admin.monthSalary = 100;
        admin.yearlySalary = 500;

        int bonus = admin.adminAllownce(10);
        System.out.println(bonus);

// accessing Dog class
        var Dog = new Dog("leo", 5, "cake");
        System.out.println(Dog.name + Dog.food);
        Dog.berk();
        var DogTwo = new Dog("bingo", 6, "rice");






    }




}