// Shape interface
interface Shape {
    void draw();
}

// Concrete Circle class implementing Shape
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete Rectangle class implementing Shape
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Shape Factory to create different types of shapes
class ShapeFactory {
    // Factory method to create a shape
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type.");
        }
    }
}

// Main class to demonstrate the Factory Pattern
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("circle");
        circle.draw(); // Output: Drawing a Circle

        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw(); // Output: Drawing a Rectangle

        // Throws IllegalArgumentException
        Shape weird = shapeFactory.createShape("weird");
        weird.draw();
    }
}
