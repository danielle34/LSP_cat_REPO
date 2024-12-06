package org.howard.edu.lsp.finalexam.question3;


/**
 * Driver class to test the functionality of the ShapeRenderer and ShapeFactory classes.
 * 
 * bc of my junit issue i had gpt help me make this file really quickly - it is the driver version of my test cases since i can't run them
 */
public class ShapeRendererDriver {
    public static void main(String[] args) {
        // Testing the ShapeRenderer class
        System.out.println("=== Testing ShapeRenderer ===");
        ShapeRenderer renderer = new ShapeRenderer();

        // Test rendering a circle
        System.out.println("Rendering a Circle:");
        renderer.renderShape("circle"); // Output: Drawing a Circle

        // Test rendering a rectangle
        System.out.println("\nRendering a Rectangle:");
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle

        // Test rendering a triangle
        System.out.println("\nRendering a Triangle:");
        renderer.renderShape("triangle"); // Output: Drawing a Triangle

        // Test rendering an unknown shape
        System.out.println("\nRendering an Unknown Shape (Hexagon):");
        renderer.renderShape("hexagon"); // Output: Unknown shape type: hexagon

        // Testing the ShapeFactory Singleton
        System.out.println("\n=== Testing ShapeFactory Singleton ===");
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();

        if (factory1 == factory2) {
            System.out.println("Singleton Test Passed: Both factory instances are the same.");
        } else {
            System.out.println("failed");
        }

        // Testing ShapeFactory creation of a circle
        System.out.println("\nTesting ShapeFactory creation of a Circle:");
        Shape circle = factory1.getShape("circle");
        if (circle != null) {
            System.out.println("Shape created successfully:");
            circle.draw(); // Output: Drawing a Circle
        } else {
            System.out.println("failed");
        }

        // Testing ShapeFactory creation of a rectangle
        System.out.println("\nTesting ShapeFactory creation of a Rectangle:");
        Shape rectangle = factory1.getShape("rectangle");
        if (rectangle != null) {
            System.out.println("Shape created successfully:");
            rectangle.draw(); // Output: Drawing a Rectangle
        } else {
            System.out.println("failed");
        }

        // Testing ShapeFactory creation of a triangle
        System.out.println("\nTesting ShapeFactory creation of a Triangle:");
        Shape triangle = factory1.getShape("triangle");
        if (triangle != null) {
            System.out.println("Shape created successfully:");
            triangle.draw(); // Output: Drawing a Triangle
        } else {
            System.out.println("failed");
        }

        // Testing ShapeFactory creation of an unknown shape
        System.out.println("\nTesting ShapeFactory creation of an Unknown Shape (Hexagon):");
        Shape hexagon = factory1.getShape("hexagon");
        if (hexagon != null) {
            System.out.println("Shape created successfully:");
            hexagon.draw();
        } else {
            System.out.println("failed");
        }
    }
}
