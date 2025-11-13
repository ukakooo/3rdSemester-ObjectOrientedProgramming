package Experiment1;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill); //Pay for the electricity bill
        System.out.println("-------------------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); //Pay for the permanent employee
        System.out.println("-------------------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); //Show the permanent employee info
        System.out.println("-------------------------------------------");
        ow.showMyEmployee(iEmp); //Show the internship employee info
    }
}
