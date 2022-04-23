/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author longy
 */
public class Point {
    public float x;
    public float y;
    
    public Point(){}
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public boolean isEqual(Point point) {
        return this.x == point.getX() && this.y == point.getY();
    }
    
    public boolean isEqual(float x, float y) {
        return this.x == x && this.y == y;
    }
}
