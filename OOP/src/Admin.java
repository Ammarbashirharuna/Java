public class Admin {
    private int monthSalary;
    private int yearlySalary;


    public int adminAllownce(   int  adminAllowance){
        return getYearlySalary() * getMonthSalary() + adminAllowance ;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
}
