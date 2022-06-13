package oops.concepts.learning.ex3;

public class Circle1 {
    private double x,y;
    private double r;

    //Adding constructors
    public Circle1() {
    }
    //parametrized constructor (with radius)
    public Circle1(double r) {
        this.r = r;
    }
    //parametrized constructor (with radius and x,y co-ordinates)
    public Circle1(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    double circumference(){
        return 2 * 3.14 * r;
    }
    double area (){
        return 3.14 * r * r;
    }
    public void setRadius(double r){
        this.r = r;
    }
}
