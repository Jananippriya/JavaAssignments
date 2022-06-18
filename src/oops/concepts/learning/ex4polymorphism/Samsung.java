package oops.concepts.learning.ex4polymorphism;
/*
Ex - 4 Polymorphism Assignment
2.
 */
public class Samsung extends MobileBase{
    public Samsung() {
        System.out.println("Constructing Samsung");
    }

    public Samsung(String modelName, int price) {
        super(modelName, price);
        System.out.println("Constructing Samsung");
    }

    public void calPrice() {
        System.out.println("calculating Price of Samsung");
        setPrice(getPrice() + 500);
    }
}
