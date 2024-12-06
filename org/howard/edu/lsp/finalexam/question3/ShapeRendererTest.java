package org.howard.edu.lsp.finalexam.question3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeRendererTest {

    /*
     * These couldn't be tested... but its is copy and past tetsing so i hope it runs
     */
    @Test
    void testCircle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("circle");
        assertNotNull(shape, "Circle should not be null");
        assertTrue(shape instanceof Circle, "Shape should be an instance of Circle");
    }

    @Test
    void testRectangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("rectangle");
        assertNotNull(shape, "Rectangle should not be null");
        assertTrue(shape instanceof Rectangle, "Shape should be an instance of Rectangle");
    }

    @Test
    void testTriangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("triangle");
        assertNotNull(shape, "Triangle should not be null");
        assertTrue(shape instanceof Triangle, "Shape should be an instance of Triangle");
    }

    @Test
    void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("hexagon");
        assertNull(shape, "Hexagon should be null as it is an unknown shape");
    }

    @Test
    void testSingletonFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "Both factory instances should be the same");
    }
}
