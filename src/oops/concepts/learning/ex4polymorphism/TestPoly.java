package oops.concepts.learning.ex4polymorphism;

/*
Ex - 4 Polymorphism Assignment
Test class to test Polymorphism in mobile base
 */
public class TestPoly {
    public static void main(String[] args) {
        MobileBase a,b,c,d;
        a = new MobileBase("Simple Mobile", 500);
        b = new IPhone("IPhone", 500);
        c = new Samsung("Samsung", 500);
        d = new Blackberry("Blackberry", 500);

        a.calPrice();
        b.calPrice();
        c.calPrice();
        d.calPrice();
        System.out.println("Price of MobileBase: " + a.getPrice());
        System.out.println("Price of IPhone: " + b.getPrice());
        System.out.println("Price of Samsung: " + c.getPrice());
        System.out.println("Price of Blackberry: " + d.getPrice());
    }
}
