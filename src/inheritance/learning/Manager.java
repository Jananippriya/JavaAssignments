package inheritance.learning;

import java.util.Date;

public class Manager extends Employee {
    private double allowances;

    public Manager(String name, int employeeId, String dept, Date hireDate, double hourlyRate, double allowances) {
        super(name, employeeId, dept, hireDate, hourlyRate);
        this.allowances = allowances;
    }


    @Override
    public double getSalary() {
        return super.getSalary()+allowances;
    }
}
