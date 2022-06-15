package oops.concepts.learning;



/*Java Assignments

1. Write a simple class Person, it should have following variables
* firstName
        * lastName
        * adreess
        * age
        write method in class which should return fullname , call it getFullName()
        write a constructor to create Person
        write a method to change address changeAddress(Sting address);
        write a mthod which should return the address of Person getAddress();*/
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    //constructor
    public Person() {
    }

    public Person(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    //method to get full name
    public String getFullName(){
        return this.firstName+"\t"+this.lastName;
    }
    //method to change address
    public void changeAddress(String address){
        this.address = address;
    }
    //method to get address
    public String getAddress(){
        return this.address;
    }
}
