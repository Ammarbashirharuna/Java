public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(-1);
        employee.getBaseSalary();
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
        Dog.berk();
        var DogTwo = new Dog("bingo", 6, "rice");
        DogTwo.getInfo("bingo", 23,"beans");
        Dog.setAge(34);









    }




}