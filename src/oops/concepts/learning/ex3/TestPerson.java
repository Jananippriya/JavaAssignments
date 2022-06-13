package oops.concepts.learning.ex3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println("Test Person");

        Person p = new Person();
        p.setName("Janani");
        p.setBirthDate(1990,1,1);
        System.out.println("Name: "+p.getName()+"\n"+"Birth Date: "+p.getBirthDate()+"\n"+"Age: "+p.getAge());

        //Accepting name and bdate using keyboard
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("Enter your name:");
        p1.setName(sc.next());
        System.out.println("Enter your birth year, month and date");
        p1.setBirthDate(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Name: "+p1.getName()+"\n"+"Birth Date: "+p1.getBirthDate()+"\n"+"Age: "+p1.getAge());
        //Print birthdate in format yyyy/mmm/dd
        p1.formatBirthDate(p1.getBirthDate());
    }

}
