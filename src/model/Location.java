/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author longy
 */
public class Location extends Point {
    float exposure;
    
    public Location( float x, float y) {
        super(x,y);
        this.exposure = 0;
    }
    
    public Location(){
        this(0,0);
    }

    public float getExposure() {
        return exposure;
    }

    public void setExposure(float exposure) {
        this.exposure = exposure;
    }
    
    
    public double euclidDistance(Point point) {
        return Math.sqrt(Math.pow((this.x - point.getX()), 2) + Math.pow((this.y- point.getY()), 2));
    }

    @Override
    public String toString() {
        return "Location: ( " + x + ", " + y + " )";
    }
    
    
    
    
    
    
}

