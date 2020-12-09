/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomythepillow.location.vector;

import com.tomythepillow.location.ILocation;
import com.tomythepillow.location.point.Point;

/**
 *
 * @author TomyThePillow
 */
public class Vector implements ILocation{

    private float x;
    private float y;

    public Vector(){}
    
    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Point translate(float x, float y){
        return new Point(x, y);
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
