package org.example;

import java.util.ArrayList;

public class Rectangle {


    public int height;
    public int width;
    public static ArrayList<Rectangle> mInstances = new ArrayList<>();

    public Boolean shape;

    public Boolean isValid;

    public Rectangle(int h, int w){
        this.height = h;
        this.width = w;
        this.shape = isRectSquare();
        this.mInstances.add(this);
    }

    public static ArrayList<Rectangle> getAll(){
        return mInstances;
    }

    public boolean isRectSquare(){
        if (height == width){
            return true;
        }
        return false;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public static ArrayList<Rectangle> getInstances() {
        return mInstances;
    }

    public Boolean getShape() {
        return shape;
    }

    public boolean testValid(){

        if(this.width <= 0 || this.height <= 0){
            this.isValid = false;
        }
        else{
            this.isValid = true;
        }
        return this.isValid;
    }

    public Boolean getIsValid() {
        return isValid;
    }


    public int area() {
        return height * width;
    }
}
