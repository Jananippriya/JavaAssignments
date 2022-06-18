package oops.concepts.learning.ex4polymorphism.q3;

/*
Ex - 4 Polymorphism Assignment
3.
 */
public class Samsung extends MobileBase {
    public Samsung() {
        System.out.println("Constructing Samsung");
    }

    public Samsung(String modelName, int price) {
        super(modelName, price);
        System.out.println("Constructing Samsung");
    }

    @Override
    public void calPrice() {
        System.out.println("calculating Price of Samsung");
        setPrice(getPrice() + 500);
    }
}
