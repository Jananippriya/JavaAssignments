package oops.concepts.learning.ex4Inheritance;

/* Ex-4 Inheritance Assignment
1. Student Class that extends Person
Complete the class with respective get set methods
1.3. Add constructors with parameters
1.4. Add default constructor in Student class
1.5. Add disp() method in both class to display members
 */
public class Student extends Person {
    private int studentNum;
    private double marks;

    //Constructor
    //default constructor


    public Student(String firstName, String lastName, int sinNum) {
        super(firstName, lastName, sinNum);
    }

    //parametrized constructor
    public Student(String firstName, String lastName, int sinNum, int studentNum, double marks) {
        super(firstName, lastName, sinNum);
        this.studentNum = studentNum;
        this.marks = marks;
    }

    //getters and setters
    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    //disp() method to display all members
    public void disp(){
        System.out.println("Student:");
        System.out.println("First Name: "+getFirstName()+"\nLast Name: "+getLastName()+"\nSin Number: "+getSinNum() +
                "\nStudent Number: "+this.studentNum+"\nMarks: "+this.marks);
    }

}
