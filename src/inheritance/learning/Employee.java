package inheritance.learning;

import java.util.Date;

public class Employee {
    private String name;
    private int employeeId;
    private String dept;
    private Date hireDate;
    private double hourlyRate;

    public Employee(String name, int employeeId, String dept, Date hireDate, double hourlyRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.dept = dept;
        this.hireDate = hireDate;
        this.hourlyRate = hourlyRate;
    }

    public String getEmployeeDetails(){
        return "Employee Name: "+name+"\n"+"Id: "+employeeId+"\n"+"Department: "+dept+"\n"+
                "Hire Date: "+hireDate+"\n"+"Salary: $"+getSalary()+"/yr";
    }

    public double getSalary(){
        double salary = hourlyRate * 40 * 4 * 12;
        return salary;
    }
}
