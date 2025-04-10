package src;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.5, 5.0);
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder volume: " + cylinder.getVolume());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Cuboid: " + cuboid.getArea());
        System.out.println("Cuboid height: " + cuboid.getHeight());
        System.out.println("Cuboid volume: " + cuboid.getVolume());
    }
}