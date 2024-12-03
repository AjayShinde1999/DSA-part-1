package patterns;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("draw circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("draw rectangle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("draw square");
    }
}

class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }
}


public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
