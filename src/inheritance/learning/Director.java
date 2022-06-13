package inheritance.learning;

import java.util.Date;

public class Director extends Manager{
    private double bonus;

    public Director(String name, int employeeId, String dept, Date hireDate, double hourlyRate, double allowances, double bonus) {
        super(name, employeeId, dept, hireDate, hourlyRate, allowances);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
