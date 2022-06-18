package oops.concepts.learning.ex4polymorphism;

/*
Ex - 4 Polymorphism Assignment
2.
                    MobileBase
                        |
     |                  |                   |
IPhone               Samsung          Blackberry

Code the above classes
 */
public class MobileBase {

    private String modelName;
    private int price;

    public MobileBase() {
        System.out.println("Constructing Mobile Base");
    }

    public MobileBase(String modelName, int price) {
        System.out.println("Constructing mobile Base with params");
        this.modelName = modelName;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //method calprice()
    public void calPrice(){
        System.out.println("calculating Price of MobileBase");
        price = price + 5;
    }
}
