/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomythepillow.location.point;

import com.tomythepillow.location.ILocation;
import com.tomythepillow.location.vector.Vector;

/**
 *
 * @author TomyThePillow
 */
public class Point implements ILocation{
    
    private float x;
    private float y;
    
    public Point(){}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    
    public Point addVector(Vector vector){
        this.x += vector.getX();
        this.y += vector.getY();
        return this;
    }
    
    
    @Override
    public void setX(float x) {
        this.x = x;
    }
    
    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }
    
    @Override
    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{" + this.x + ", " + this.y + "}";
    }

 
    
}
