package oops.concepts.learning.ex4Inheritance;


/* Ex - 4 Inheritance Assignment
1. Code Person class and student Class that extends Person
Complete this class with respective get set methods
1. 3. Add constructors with Parameters
1.5. Add disp() method in both class to display members
 */
public class Person {
    private String firstName;
    private String lastName;
    private int sinNum;

    //constructor
    //parametrized constructor
    public Person(String firstName, String lastName, int sinNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sinNum = sinNum;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSinNum() {
        return sinNum;
    }

    public void setSinNum(int sinNum) {
        this.sinNum = sinNum;
    }

    //disp() method to display all members
    public void disp(){
        System.out.println("First Name: "+this.firstName+"\nLast Name: "+this.lastName+"\nSin Number: "+this.sinNum);
    }
}
