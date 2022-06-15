package inheritance.learning;

import java.util.Date;

/*Java Assignment
14. Write test class to create an employee, manager, and director,
 */
public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee("Janu",12345,"IT",new Date(119,5,12),40);
        System.out.println(emp.getEmployeeDetails());

        Manager man = new Manager("Janani",123,"HR",new Date(110,01,01),50,1000);
        System.out.println(man.getEmployeeDetails());

        Director dir = new Director("Priya",1,"HR",new Date(109,05,10),70,1500,1000);
        System.out.println(dir.getEmployeeDetails());
    }
}
