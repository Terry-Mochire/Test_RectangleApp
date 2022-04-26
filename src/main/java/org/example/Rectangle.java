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

        if(w <= 0 || h <= 0){
            this.isValid = false;
        }
        else{
            this.isValid = true;
        }
        System.out.println(String.valueOf(this.isValid));
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

    public static ArrayList<Rectangle> getmInstances() {
        return mInstances;
    }

    public Boolean getShape() {
        return shape;
    }

    public Boolean getIsValid() {
        return isValid;
    }


}
