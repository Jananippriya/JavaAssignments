package oops.concepts.learning.ex4polymorphism.q3;

/*
Ex - 4 Polymorphism Assignment
3. Test class to test Polymorphism in mobile base
 */
public class TestPoly {
    public static void main(String[] args) {
        //Creating objects using loose coupling
        MobileBase mobile1, mobile2, mobile3, mobile1a, mobile1b;
        mobile1 = new IPhone("IPhone", 500);
        mobile2 = new Samsung("Samsung", 500);
        mobile3 = new Blackberry("Blackberry", 500);
        mobile1a = new XIPhone("XIPhone", 500);
        mobile1b = new XXIPhone("XXIPhone", 500);

        //Calculating the prices of mobiles
        mobile1.calPrice();
        mobile2.calPrice();
        mobile3.calPrice();
        mobile1a.calPrice();
        mobile1b.calPrice();

        //Displaying the prices of mobiles
        System.out.println("Price of IPhone: " + mobile1.getPrice());
        System.out.println("Price of Samsung: " + mobile2.getPrice());
        System.out.println("Price of Blackberry: " + mobile3.getPrice());
        System.out.println("Price of XIPhone: " + mobile1a.getPrice());
        System.out.println("Price of XXIPhone: " + mobile1b.getPrice());

    }
}
