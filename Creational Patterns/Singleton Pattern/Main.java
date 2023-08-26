class Shape {
    // class variables
    private static Shape instance; // singleton instance
    private String shapeType; // shape type (circle, square, etc.)

    // private constructor (no instantiation)
    private Shape() {
        System.out.println("Shape instance created.");
    }

    // static method to get singleton instance
    public static Shape getInstance() {
        if (instance == null) { // if instance is null, create new instance
            instance = new Shape(); // create new instance
        }
        return instance; // return instance
    }

    // get shape type
    public String getShapeType() {
        return shapeType;
    }

    // set shape type
    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    // draw shape
    public void draw() {
        System.out.println("Drawing " + shapeType + "...");
    }
}

public class Main {
    public static void main(String[] args) {
        // here i cant use new Shape() because constructor is private
        Shape circle = Shape.getInstance(); // get singleton instance
        circle.setShapeType("Circle"); // set shape type
        circle.draw(); // draw shape

        Shape square = Shape.getInstance(); // get singleton instance
        square.setShapeType("Square"); // set shape type
        square.draw(); // draw shape

        // checking if circle and square are the same instance
        if (circle == square) {
            System.out.println("Circle and square are the same instance.");
        } else {
            System.out.println("Circle and square are not the same instance.");
        }
    }
}

