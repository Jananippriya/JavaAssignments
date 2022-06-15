package inheritance.learning;

import java.util.Date;

/* Java Assignment
14. Inherritance - Assignment
Create a class Employee, which will have following instance variables and methods
String name;
int employeeId;
String dept;
Date hireDate;
double hourlyRate;
String getEmployeeDetails()
// shoudl return employee details as String with salary details
//Hint String details = "Employee Name = "+ name + " Id = +id + "Dept "+dept.....
double getSalary() {
//write logic for the salary calculation
}
 */
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
