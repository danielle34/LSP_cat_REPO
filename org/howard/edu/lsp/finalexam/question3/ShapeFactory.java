package org.howard.edu.lsp.finalexam.question3;


/**
 * Singleton Factory class for creating Shape objects.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
    }

    /**
     * Returns the singleton instance of ShapeFactory.
     *
     * @return the single instance of ShapeFactory.
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates a Shape object based on the shape type.
     *
     * @param shapeType the type of shape to create.
     * @return the Shape object, or null if the type is unknown.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
