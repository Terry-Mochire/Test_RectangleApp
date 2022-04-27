package org.example;

public class Cube {
    private Rectangle mFace;

    public Cube(Rectangle rectangle){
        mFace = rectangle;
    }

    public Rectangle getmFace() {
        return mFace;
    }

    public int getVolume() {
        int length = mFace.getHeight();
        return length * length * length;
    }

    public int getSurfaceArea() {
        return mFace.area() *6 ;
    }
}
