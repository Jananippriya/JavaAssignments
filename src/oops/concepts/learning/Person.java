package oops.concepts.learning;

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
