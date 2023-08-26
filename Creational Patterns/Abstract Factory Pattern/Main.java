// Abstract Product: Shape
interface Shape {
    void draw();
}

// Concrete Product: Circle
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete Product: Square
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Abstract Factory: ShapeFactory
interface ShapeFactory {
    Shape createShape();
}

// Concrete Factory: CircleFactory
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

// Concrete Factory: SquareFactory
class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle using the CircleFactory
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();  // Output: Drawing a Circle
        
        // Create a Square using the SquareFactory
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();  // Output: Drawing a Square
    }
}
