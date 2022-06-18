package oops.concepts.learning.ex4polymorphism.q3;


/*
Ex - 4 Polymorphism Assignment
3.
 */
public class XXIPhone extends XIPhone {
    public XXIPhone() {
        System.out.println("Constructing XXIPhone");
    }

    public XXIPhone(String modelName, int price) {
        super(modelName, price);
        System.out.println("Constructing XXIPhone with params");
    }

    @Override
    public void calPrice() {
        System.out.println("calculating Price of XXIPhone");
        setPrice(getPrice() + 300);
    }
}
