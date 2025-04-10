package src;

public class Circle {
    // Field (instance variable)
    private double radius;

    // Constructor method
    public Circle(double radius) {
        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Getter method
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
