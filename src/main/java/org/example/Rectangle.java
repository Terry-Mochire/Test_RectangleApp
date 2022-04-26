package org.example;

import java.util.ArrayList;

public class Rectangle {
    private int height;
    private int width;
    private static ArrayList<Rectangle> mInstances = new ArrayList<>();

    private Boolean shape;

    private Boolean isValid;


    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
        this.mInstances.add(this);
        this.shape = isRectSquare();
        dimensions();

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public static ArrayList<Rectangle> getAll(){
        return mInstances;
    }

    public Boolean getShape() {
        return shape;
    }

    public boolean isRectSquare(){
        if ( height == width){
            return true;
        } else {
            return false;
        }
    }

    public Boolean getValid() {
        return isValid;
    }

    public void dimensions(){
        if ( (height <= 0) ){
            isValid = false;
        } isValid = true;
    }
}
