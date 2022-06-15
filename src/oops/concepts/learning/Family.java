package oops.concepts.learning;


/* Java Assignment
2. Write a simple class Family, it should have following variables

        * FatherName, MotherName, SonName, DaughterName
        * FatherSalary, MotherSalary, SonFee, DaughterFee
        * Grocery (hard coded value – 500)
        Write a constructor to create Family
        Write a method just to display all family members name, call it displayNames()
        Write method in class which should return total salary, call it getTotalSalary()
        Write method in class which should return total fees, call it getTotalFee()
        Write a method which should return the total savings after removing all expenses getSavings();
        Write a method using if else which should check if savings are > 1000, it should display the
        message “Congratulation!! FatherName you saved this much = savings value”
        Else “Dear FatherName!! Please try to save for next month”.

 */
public class Family {
    private static final double grocery = 500.0;
    private String fatherName;
    private String motherName;
    private String sonName;
    private String daughterName;
    private double fatherSalary;
    private double motherSalary;
    private double sonFee;
    private double daughterFee;

    public Family() {
    }

    public Family(String fatherName, String motherName, String sonName, String daughterName, double fatherSalary, double motherSalary, double sonFee, double daughterFee) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sonName = sonName;
        this.daughterName = daughterName;
        this.fatherSalary = fatherSalary;
        this.motherSalary = motherSalary;
        this.sonFee = sonFee;
        this.daughterFee = daughterFee;
    }

    //method to display all names
    public void displayNamw() {
        System.out.println("Father: " + fatherName + "\n" + "Mother: " + motherName + "\n" + "Son: " + sonName + "\n" + "Daughter: " + daughterName);
    }

    //method to get total salary
    public double getTotalSalary(){
        return fatherSalary + motherSalary;
    }
    //method to get total fee
    public double getTotalFee(){
        return sonFee + daughterFee;
    }

    //method to get savings
    public double getSavings(){
        return getTotalSalary() - getTotalFee() - grocery;
    }
    //method to check if saving > 1000
    public void checkSavings(){
        if(getSavings() > 1000){
            System.out.println("Congratulations!! "+fatherName+" you saved this much = "+getSavings());
        }else
            System.out.println("Dear "+fatherName+" !! Please try to save for next month.");
    }

}
