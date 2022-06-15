package inheritance.learning;

import java.util.Date;

/* Java Assignment
14. Create class Director which will extend the Manager and will have hourly rate, allowance
and bonus and override getSalary to include bonus
 */
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
