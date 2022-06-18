package oops.concepts.learning.ex4polymorphism.q3;

/*
Ex - 4 Polymorphism Assignment
3.
 */
public class IPhone extends MobileBase {
    public IPhone() {
        System.out.println("Constructing IPhone");
    }

    public IPhone(String modelName, int price) {
        super(modelName, price);
        System.out.println("Constructing IPhone");
    }

    @Override
    public void calPrice() {
        System.out.println("calculating Price of IPhone");
        setPrice(getPrice() + 100);
    }
}
