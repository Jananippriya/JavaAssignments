package oops.concepts.learning.ex4polymorphism;

/*
Ex - 4 Polymorphism Assignment
2.
 */
public class Blackberry extends MobileBase{
    public Blackberry() {
        System.out.println("Constructing Blackberry");
    }

    public Blackberry(String modelName, int price) {
        super(modelName, price);
        System.out.println("Constructing Blackberry");
    }

    public void calPrice() {
        System.out.println("calculating Price of Blackberry");
        setPrice(getPrice() + 1000);
    }
}
