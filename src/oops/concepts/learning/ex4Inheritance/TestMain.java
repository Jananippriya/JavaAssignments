package oops.concepts.learning.ex4Inheritance;

/* Ex - 4 Inheritance Assignment
1. 2. Write test class to create object of Person and Student class
1.6. Modify test class to call disp() method on student object and person object
 */
public class TestMain {
    public static void main(String[] args) {
        Person p = new Person("Janani","Priya",12345);
        Student s = new Student("abc","def",9876,1,100);
        p.disp();
        s.disp();

    }
}
