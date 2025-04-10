package src;

public class Cylinder extends Circle {
    private double height;

    // Constructor with parameters for both radius and height
    public Cylinder(double radius, double height) {
        super(radius);  // Call the parent constructor for radius
        if (height <= 0) {  // Check if the height is invalid (<= 0)
            this.height = 0.0;  // Set height to 0.0 if invalid
        } else {
            this.height = height;  // Set height to the provided value if valid
        }
    }

    // Method to get the height of the cylinder
    public double getHeight() {
        return this.height;
    }

    // Method to calculate and return the volume of the cylinder
    public double getVolume() {
        return getArea() * height;  // Use getArea() from Circle class to calculate volume
    }
}

