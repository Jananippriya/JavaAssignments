package oops.concepts.learning.ex4polymorphism.q3;

/*
Ex - 4 Polymorphism Assignment
3.
 */
public class XIPhone extends IPhone {

    //default constructor
    public XIPhone() {
        System.out.println("Constructing XIPhone");
    }

    //parametrized constructor
    public XIPhone(String modelName, int price) {
        super(modelName, price);
        System.out.println("Constructing XIPhone with params");
    }

    @Override
    public void calPrice() {
        System.out.println("calculating Price of XIPhone");
        setPrice(getPrice() + 200);
    }
}
