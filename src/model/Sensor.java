/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author longy
 */
public class Sensor extends Location{
    public float r;
    
    
    public Sensor(float x, float y, float r) {
        super(x,y);
        this.r = r;
    }
    
    public Sensor() {
        this(0,0,0);
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
}
