package org.howard.edu.lsp.finalexam.question3;


public class ShapeRenderer {
    private final ShapeFactory shapeFactory = ShapeFactory.getInstance();

    /**
     * Renders a shape based on the provided shape type.
     *
     * @param shapeType the type of shape to render (e.g., "circle", "rectangle", "triangle").
     */
    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}
