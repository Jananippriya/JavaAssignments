package oops.concepts.learning.ex4polymorphism.q3;

/*
Ex - 4 Polymorphism Assignment
2. Modify above to match the following implementation hierarchy
                    MobileBase
                        |
     |``````````````````|`````````````````|
IPhone               Samsung          Blackberry
    |
XIPhone
    |
XXIPhone

3.Modify code to declare calPrice() in base class as abstract method
 */
public abstract class MobileBase {

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
    public abstract void calPrice();
}
