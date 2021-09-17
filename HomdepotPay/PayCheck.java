package HomdepotPay;

public class PayCheck {
    public static void main(String[] args) {
        EmployeeName Marco = new EmployeeName(13,40);
        System.out.println(Marco.payCheck());

        EmployeeName Shan = new EmployeeName(15,35);
        System.out.println(Shan.payCheck());
    }
}
