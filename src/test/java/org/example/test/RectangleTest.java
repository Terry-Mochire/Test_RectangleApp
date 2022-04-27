package org.example.test;

import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getAll() {
        Rectangle rectangle = new Rectangle(12, 7);
        Rectangle rectangle2 = new Rectangle(10, 8);
        assertTrue(Rectangle.getAll().contains(rectangle));
        assertTrue(Rectangle.getAll().contains(rectangle2));
    }
    @Test
    void isRect(){
        Rectangle rectangle = new Rectangle(12, 7);
        assertFalse(rectangle.isRectSquare());
    }

    @Test
    void isSquare(){
        Rectangle rectangle = new Rectangle(6,6);
        assertTrue(rectangle.isRectSquare());
    }

    @Test
    void getHeight() {
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals(5, rectangle.getHeight());
    }

    @Test
    void getWidth() {

    }

    @Test
    void getInstances() {
    }

    @Test
    void getShape() {
    }

    @Test
    void getIsValid() {
    }

    @Test
    void area(){
        Rectangle testRectangle = new Rectangle(15, 30);
        assertEquals(450, testRectangle.area());
    }

    @Test
    void testValidDimensions(){
        Rectangle testRectangle = new Rectangle(-1, -1);

        assertFalse(testRectangle.testValid());
    }
}