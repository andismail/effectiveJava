package com.jthan.book;

/**
 * Created by Jthan on 16/2/29.
 */
public enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    MARS(6.419e+23, 3.393e6);

    private static final double G = 6.67300E-11;

    private double mass;

    private double radius;

    private double surfaceGravity;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() { return mass; }
    public double radius(){ return radius;}
    public double surfaceGravity(){ return surfaceGravity; }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;// F = ma
    }

}
