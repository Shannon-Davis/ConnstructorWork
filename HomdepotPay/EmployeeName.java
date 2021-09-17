package HomdepotPay;

public class EmployeeName {
    public double hoursWorked;
    public double hoursPay;

    public EmployeeName(double hoursPay, double hoursWorked){
        this.hoursPay = hoursPay;
        this.hoursWorked = hoursWorked;
    }

    public double payCheck(){
        return this.hoursWorked * this.hoursPay;
    }
}
