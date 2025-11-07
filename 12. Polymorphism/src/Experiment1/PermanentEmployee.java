package Experiment1;

public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPayableAmount() {
        // TODO Auto-generated method stub
        return (int) (salary + 0.05 * salary);
    }

    @Override
    public String getEmployeeInfo() {
        // TODO Auto-generated method stub
        String info = super.getEmployeeInfo();
        info += "Registered as a Permanent employee with salary: " + salary + "\n";
        return info;
    }
}
