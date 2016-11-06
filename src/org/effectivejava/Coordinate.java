package org.effectivejava;

/**
 * Created by yuhzheng on 11/6/16.
 * Static Factory instead of constructor
 */
public class Coordinate {
    private double x;
    private double y;

    //make constructor private, to prevent instantiation
    private Coordinate(double x, double y){
        this.x=x;
        this.y=y;
    }

    public static final Coordinate fromXY(double x, double y){
        return new Coordinate(x,y); //inside the class, the private constructor still can be called
    }

    public static final Coordinate fromPolar(double dist, double angle){
        return new Coordinate(dist*Math.cos(angle), dist*Math.sin(angle));
    }
}
