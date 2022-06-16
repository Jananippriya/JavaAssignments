package oops.concepts.learning.ex3;

/* Ex - 3 Assignment
2. Code 2 class in 2 seperate files oops2.java and Circle1.java
3. Declare variables in circle class as private
4. Add set method to set the values of radius.
5. Add constructors
 */
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

    //method to set radius
    public void setRadius(double r){
        this.r = r;
    }
}
