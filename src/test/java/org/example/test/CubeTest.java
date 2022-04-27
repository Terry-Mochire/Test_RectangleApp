package org.example.test;

import org.example.Cube;
import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {
    @Test
    void newCube_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(true, testCube instanceof Cube);
    }

    @Test
    void newCube_SavesRectangleInformation_Rectangle() {
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(testRectangle, testCube.getmFace());
    }
    @Test
    void determinestheVolumeoftheCube(){
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(27000, testCube.getVolume());
    }

    @Test
    void determineSurfaceAreaoftheCube(){
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(5400, testCube.getSurfaceArea());
    }
}